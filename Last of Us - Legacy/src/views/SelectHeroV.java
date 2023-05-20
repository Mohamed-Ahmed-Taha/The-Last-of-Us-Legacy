package views;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.scene.input.KeyEvent;
import javafx.scene.media.*;

import java.io.IOException;

import controller.SelectHeroC;
import exceptions.MovementException;
import exceptions.NotEnoughActionsException;
import javafx.scene.image.*;
import javafx.event.*;
import javafx.scene.input.*;

public class SelectHeroV {
	
	public SelectHeroV(SelectHeroC controller, Stage primaryStage) {
		
		VBox v = new VBox();
		HBox h1 = new HBox();
		HBox h2 = new HBox();
		
		Button joelB = new Button("Joel");
		Button ellieB = new Button("Ellie");
		Button tessB = new Button("Tess");
		Button rileyB = new Button("Riley");
		Button tommyB = new Button("Tommy");
		Button billB = new Button("Bill");
		Button davidB = new Button("David");
		Button henryB = new Button("Henry");
		
		h1.getChildren().add(joelB);
		h1.getChildren().add(ellieB);
		h1.getChildren().add(tessB);
		h1.getChildren().add(rileyB);
		h1.setAlignment(Pos.CENTER);
		h1.setSpacing(10);
		
		h2.getChildren().add(tommyB);
		h2.getChildren().add(billB);
		h2.getChildren().add(davidB);
		h2.getChildren().add(henryB);
		h2.setAlignment(Pos.CENTER);
		h2.setSpacing(10);
				
		v.getChildren().addAll(h1, h2);
		v.setAlignment(Pos.CENTER);
		v.setSpacing(5);
		v.setScaleX(5);
		v.setScaleY(5);
		
		joelB.setOnMouseClicked(controller);
		ellieB.setOnMouseClicked(controller);
		tessB.setOnMouseClicked(controller);
		rileyB.setOnMouseClicked(controller);
		tommyB.setOnMouseClicked(controller);
		billB.setOnMouseClicked(controller);
		davidB.setOnMouseClicked(controller);
		henryB.setOnMouseClicked(controller);
				
		Scene scene = new Scene(v, Screen.getPrimary().getBounds().getMaxX()- 360, Screen.getPrimary().getBounds().getMaxY()-360);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
