package com.example.realmdatabasetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.realmdatabasetutorial.model.Student;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private EditText name, age;
    private TextView display;
    private Button saveButton;

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.name);
        age = (EditText)findViewById(R.id.age);
        saveButton = (Button)findViewById(R.id.save_btn);
        display = (TextView)findViewById(R.id.display);

        realm = Realm.getDefaultInstance();

        restartDatabase();

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Saving data only if name and age were typed:
                if(!name.getText().toString().equals("") && !age.getText().toString().equals("")){
                    saveData();
                }
            }
        });
    }

    // Restarts database every time the app is opened:
    private void restartDatabase(){
        realm.beginTransaction();
        realm.deleteAll();
        realm.commitTransaction();
    }

    private void restartInputFields(){
        name.setText("");
        age.setText("");
    }

    private void saveData(){
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm bgRealm) {
                Student student = bgRealm.createObject(Student.class);
                student.setName(name.getText().toString().trim());
                student.setAge(Integer.parseInt(age.getText().toString().trim()));
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Log.d(TAG, "onSuccess: Data written successfully!");
                readData();
                restartInputFields();
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Log.d(TAG, "onError: Error on writing data!");
            }
        });
    }

    private void readData(){
        RealmResults<Student> students = realm.where(Student.class).findAll();

        display.setText("");
        StringBuilder data = new StringBuilder();

        for(Student student: students){
            try {
                data.append(student.toString()).append("\n");
            }catch (NullPointerException e){
                e.printStackTrace();
            }
        }

        display.setText(data);
    }
}