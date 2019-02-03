/* 11 - CheckBox */

package com.javafx.part11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
		window.setTitle("Polymatus Library");
		
		CheckBox box1 = new CheckBox("Book");
		CheckBox box2 = new CheckBox("Magazine");
		
		button = new Button("Order now!");
		button.setOnAction(e -> handleOptions(box1, box2));
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(box1, box2, button);
		
		scene = new Scene(layout, 400, 400);
		window.setScene(scene);
		window.show();
		
		// Selected by default:
		box1.setSelected(true);
	}	
	
	private void handleOptions(CheckBox box1, CheckBox box2) {
		
		String message = "User order: ";
		
		if(box1.isSelected()) {
			
			message +="\nBook";
		}
		
		if(box2.isSelected()) {
			
			message += "\nMagazine";
		}
		
		System.out.println(message);
	}
}
