/* 19 - Editable Table */

package com.javafx.part19;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;
	TableView<Product> table;
	TextField nameInput, priceInput, quantityInput;
	
	public static void main(String[] args) {

		launch(args);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("JavaFX - Polymatus");
		
		TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(300);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
		priceColumn.setMinWidth(100);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Quantity");
		quantityColumn.setMinWidth(100);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		
		nameInput = new TextField();
		nameInput.setPromptText("Name");
		nameInput.setMinWidth(100);
		
		priceInput = new TextField();
		priceInput.setPromptText("Price");
		
		quantityInput = new TextField();
		quantityInput.setPromptText("Quantity");
		
		Button addButton = new Button("Add");
		Button deleteButton = new Button("Delete");
		
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10, 10, 10, 10));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);
		
		table = new TableView<>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(hBox, table);
		
		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
	}
	
	public ObservableList<Product> getProduct(){
		
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Notebook", 900.00, 10));
		products.add(new Product("A Ler Vazios", 20.00, 50));
		products.add(new Product("Soccer Ball", 10, 3));
		products.add(new Product("Dead Poets Society", 30.00, 1));
		products.add(new Product("Jacket", 100.00, 2));
		
		return products;		
	}
}
