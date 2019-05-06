/* 7 - Closing the program properly */

package com.javafx.part07;

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
		window.setOnCloseRequest(e -> {
			
			e.consume();
			closeProgram();
		});
		
		button = new Button("Close program");
		button.setOnAction(e -> closeProgram());
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 400, 400);
		window.setScene(scene);
		window.show();
	}
	
	private void closeProgram() {
		
		boolean answer = ConfirmBox.display("Confirm", "Do you want to exit?");
		
		if(answer) {
			
			window.close();
		}
	}
}
