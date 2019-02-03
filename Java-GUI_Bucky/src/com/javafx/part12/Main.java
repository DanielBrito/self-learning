/* 12 - ChoiceBox (DropDown Menu) */

package com.javafx.part12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
		
		button = new Button("Click me!");
		
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		choiceBox.getItems().add("Book");
		choiceBox.getItems().add("Magazine");
		choiceBox.getItems().add("Manga");
		choiceBox.getItems().addAll("HQ", "Fanzine", "Ebook");
		
		// Selected by default:
		choiceBox.setValue("Book");
		
		button.setOnAction(e -> getChoice(choiceBox));
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(choiceBox, button);
		
		scene = new Scene(layout, 400, 400);
		window.setScene(scene);
		window.show();
	}
	
	private void getChoice(ChoiceBox<String> choiceBox) {
		
		String type = choiceBox.getValue();
		
		System.out.println(type);
	}
}
