package com.javafx.part32;

import javafx.scene.control.Button;

public class Controller{

   public Button button;

   public void handleButtonClick() {
	   
	   System.out.println("Run some code in background...");
	   button.setText("Clicked!");
   }
}