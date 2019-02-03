/* 10 - Extract and validate input */

package com.javafx.part10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;
	Scene scene;
	Button button;

	public static void main(String[] args) {

		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("JavaFX - Polymatus");
		
		TextField nameInput = new TextField("Enter your age");
		
		button = new Button("Validate Age");
		button.setOnAction(e -> isInt(nameInput, nameInput.getText()));
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(nameInput, button);
		
		scene = new Scene(layout, 400, 400);
		window.setScene(scene);
		window.show();		
	}
	
	private boolean isInt(TextField input, String message) {
		
		try {
			
			int age = Integer.parseInt(input.getText());
			System.out.println("User is: " + age + " years old");
			
			return true;
		}
		catch (NumberFormatException e) {
			
			System.out.println("Error: " + message + " is not a number");
			
			return false;
		}		
	}	
}
