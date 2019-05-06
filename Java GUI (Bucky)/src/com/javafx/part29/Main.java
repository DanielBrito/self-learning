/* 29 - Binding */

package com.javafx.part29;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
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
		
		IntegerProperty x = new SimpleIntegerProperty(3);
		IntegerProperty y = new SimpleIntegerProperty();
		
		y.bind(x.multiply(10));
		
		System.out.println("x = " + x.getValue());
		System.out.println("y = " + y.getValue() + "\n");
		
		x.set(9);
		
		System.out.println("x = " + x.getValue());
		System.out.println("y = " + y.getValue() + "\n");
		
		button = new Button("Submit");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		
		window.setScene(scene);
		window.show();		
	}
}
