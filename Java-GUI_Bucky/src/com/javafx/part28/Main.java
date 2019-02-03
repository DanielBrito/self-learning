/* 28 - Properties */

package com.javafx.part28;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;
	Button button;

	public static void main(String[] args) {

		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("JavaFX - Polymatus");
		
		Person daniel = new Person();
		daniel.firstNameProperty().addListener((v, oldValue, newValue) -> {
			
			System.out.println("Name changed to " + newValue);
			System.out.println("firstNameProperty(): " + daniel.firstNameProperty());
			System.out.println("getFirstName: " + daniel.getFirstName());
		});
		
		button = new Button("Submit");
		button.setOnAction(e -> daniel.setFirstName("Brito"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		
		window.setScene(scene);
		window.show();		
	}
}
