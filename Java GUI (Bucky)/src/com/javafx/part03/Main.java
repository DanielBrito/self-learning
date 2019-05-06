/* 3 - Lambda Expressions */

package com.javafx.part03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Button button;

	public static void main(String[] args) {

		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("My Window");
		button = new Button();
		button.setText("Click");
		
		/* This class will handle the button events */
		button.setOnAction(e -> {
			
			System.out.println("Hello, Daniel");
			System.out.println("This is a lambda expression");
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);		
		
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
