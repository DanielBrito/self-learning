/* 30 - Binding Properties Example */

package com.javafx.part30;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
		
		TextField userInput = new TextField();
		userInput.setMaxWidth(200);
		
		Label firstLabel = new Label("Welcome, ");
		Label secondLabel = new Label();
		
		HBox bottomText = new HBox(firstLabel, secondLabel);
		bottomText.setAlignment(Pos.CENTER);

		VBox vBox = new VBox(10, userInput, bottomText);
		vBox.setAlignment(Pos.CENTER);
		
		secondLabel.textProperty().bind(userInput.textProperty());
		
		Scene scene = new Scene(vBox, 300, 250);
		
		window.setScene(scene);
		window.show();		
	}
}
