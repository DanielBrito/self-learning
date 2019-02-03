/* 5 - Creating Alert Boxes */

package com.javafx.part05;

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
		window.setTitle("Polymatus");
		
		button = new Button("Click me");
		button.setOnAction(e -> AlertBox.display("Window", "Hello, World!"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 400, 400);
		
		window.setScene(scene);
		window.show();
	}
}
