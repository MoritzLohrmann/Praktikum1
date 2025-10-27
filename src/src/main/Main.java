package main;

import gui.SportvereinControl;
import gui.SportvereineAnwendungssystem;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		new SportvereinControl(primaryStage);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
