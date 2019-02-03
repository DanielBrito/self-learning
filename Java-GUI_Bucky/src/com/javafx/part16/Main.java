/* 16 - TreeView */

package com.javafx.part16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;
	TreeView<String> tree;
	
	public static void main(String[] args) {

		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("JavaFX - TreeView");
		
		TreeItem<String> root, daniel, carol;
		root = new TreeItem<>();
		root.setExpanded(true);
		
		daniel = makeBranch("Daniel", root);
		makeBranch("Programming", daniel);
		makeBranch("Mathematics", daniel);
		makeBranch("Automata", daniel);
		
		carol = makeBranch("Carol", root);
		makeBranch("Biology", carol);
		makeBranch("Chemistry", carol);
		
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
		tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
			
			if(newValue != null) {
				
				System.out.println(newValue.getParent().getValue() + " - " + newValue.getValue());
			}
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		Scene scene = new Scene(layout, 400, 400);
		window.setScene(scene);
		window.show();		
	}
	
	private TreeItem<String> makeBranch(String title, TreeItem<String> parent){
		
		TreeItem<String> item = new TreeItem<>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		
		return item;		
	}
}
