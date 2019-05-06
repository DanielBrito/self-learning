/* 25 - CSS Themes and Styles */

package com.javafx.part26;

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
		GridPane.setConstraints(nameLabel, 0, 0);
		
		TextField nameInput = new TextField("Username");
		GridPane.setConstraints(nameInput, 1, 0);
		
		Label passwordLabel = new Label("Password: ");
		GridPane.setConstraints(passwordLabel, 0, 1);
		
		TextField passwordInput = new TextField();
		passwordInput.setPromptText("Enter your password");
		GridPane.setConstraints(passwordInput, 1, 1);
		
		Button loginButton = new Button("Login");
		GridPane.setConstraints(loginButton, 1, 2);
		
		grid.getChildren().addAll(nameLabel, nameInput, passwordLabel, passwordInput, loginButton);
		
		Scene scene = new Scene(grid, 300, 200);
		scene.getStylesheets().add("Viper.css");
		window.setScene(scene);		
		window.show();
	}
}
