/* 1 - Creating a Basic Window */
/* 2 - Handle User Events */

package com.javafx.part01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
	
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
		button.setOnAction(this);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);		
		
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/* When button is clicked, handle() gets called. */
	/* Button click is an ActionEvent (also MouseEvents, TouchEvents etc.) */
	@Override
	public void handle(ActionEvent event) {

		if(event.getSource()==button) {
			
			System.out.println("Hello, World!");
		}
	}
}
