/* 23 - CheckMenuItem */

package com.javafx.part23;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;
	BorderPane layout;
	
	public static void main(String[] args) {

		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("JavaFX - Polymatus");
		
		// The _ indicates a shortcut for the item when alt is pressed
		Menu fileMenu = new Menu("_File");
		
		MenuItem newProject = new MenuItem("New Project...");
		newProject.setOnAction(e -> System.out.println("Create a new project!"));
		
		fileMenu.getItems().add(newProject);
		fileMenu.getItems().add(new MenuItem("Open Project..."));
		fileMenu.getItems().add(new MenuItem("Save Project..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Settings..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Close"));
		
		Menu editMenu = new Menu("_Edit");
		editMenu.getItems().add(new MenuItem("Cut"));
		editMenu.getItems().add(new MenuItem("Copy"));
		
		MenuItem paste = new MenuItem("Paste");
		paste.setOnAction(e -> System.out.println("Pasting text..."));
		paste.setDisable(true);
		editMenu.getItems().add(paste);
		
		Menu helpMenu = new Menu("Help");
		
		CheckMenuItem showLines = new CheckMenuItem("Show line numbers");
		showLines.setOnAction(e -> {
			
			if(showLines.isSelected()) {
				
				System.out.println("Program will now display line numbers");
			}
			else {
				
				System.out.println("Hiding line numbers");
			}
		});
		
		CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
		autoSave.setSelected(true);
		
		helpMenu.getItems().addAll(showLines, autoSave);
		
		
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
		
		layout = new BorderPane();
		layout.setTop(menuBar);
		
		Scene scene = new Scene(layout, 400, 300);
		
		window.setScene(scene);
		window.show();
	}
}
