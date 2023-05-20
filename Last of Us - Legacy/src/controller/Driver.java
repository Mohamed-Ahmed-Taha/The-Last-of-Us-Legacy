package controller;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import engine.Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import views.SelectHeroV;

public class Driver extends Application {
	
	@Override
	public void init() {
		
		try {
			File file = new File(getClass().getResource("/views/media/Heros.csv").toURI());
			Game.loadHeroes(file.toString());
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		SelectHeroC selectHero = new SelectHeroC(primaryStage);
		
		
		
	}
	
	public static void main(String[] args) {
			launch();
	}
	


}