/* 6 - Communicating between windows */

package com.javafx.part06;

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
		button.setOnAction(e -> {
			
			boolean result = ConfirmBox.display("Window", "Are you all right?");
			System.out.println(result);
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 400, 400);
		
		window.setScene(scene);
		window.show();
	}
}
