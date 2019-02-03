/* 27 - CSS Custom Style Classes and Selectors */



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;

	public static void main(String[] args) {

		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("JavaFX - Polymatus");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		Label nameLabel = new Label("Username: ");
		nameLabel.setId("bold-label");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		TextField nameInput = new TextField("Username");
		GridPane.setConstraints(nameInput, 1, 0);
		
		Label passwordLabel = new Label("Password: ");
		passwordLabel.setId("bold-label");
		GridPane.setConstraints(passwordLabel, 0, 1);
		
		TextField passwordInput = new TextField();
		passwordInput.setPromptText("Enter your password");
		GridPane.setConstraints(passwordInput, 1, 1);
		
		Button loginButton = new Button("Login");
		GridPane.setConstraints(loginButton, 1, 2);
		
		Button signButton = new Button("Sign Up");
		signButton.getStyleClass().add("button-blue");
		GridPane.setConstraints(signButton, 1, 3);
		
		grid.getChildren().addAll(nameLabel, nameInput, passwordLabel, passwordInput, loginButton, signButton);
		
		Scene scene = new Scene(grid, 300, 200);
		scene.getStylesheets().add("Viper.css");
		window.setScene(scene);		
		window.show();
	}
}
