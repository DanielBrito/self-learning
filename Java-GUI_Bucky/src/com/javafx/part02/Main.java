/* 2 - Handle User Events + 3 - Anonymous Inner Classes */

package com.javafx.part02;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {

				System.out.println("I am an anonymous inner class");				
			}
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);		
		
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
