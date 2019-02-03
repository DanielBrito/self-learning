/* 13 - Listening for Selection Changes */

package com.javafx.part13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;
	Scene scene;

	public static void main(String[] args) {

		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("ChoiceBox Demo");
		
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		choiceBox.getItems().add("Book");
		choiceBox.getItems().add("Magazine");
		choiceBox.getItems().add("Manga");
		choiceBox.getItems().addAll("HQ", "Fanzine", "Ebook");
		
		// Selected by default:
		choiceBox.setValue("Book");
		
		choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> System.out.println(newValue));
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(choiceBox);
		
		scene = new Scene(layout, 400, 400);
		window.setScene(scene);
		window.show();
	}
}
