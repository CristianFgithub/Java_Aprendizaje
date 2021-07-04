package application;

import emergente.VentanaDialogo;
import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;

public class SalirDeAplicacion extends Application {

	Stage miStage;
	
	int contadorDeClicks=0;
	
	
	@Override
	public void start(Stage primaryStage) {
		
		miStage = primaryStage;
		
		Button botonclick = new Button();
		botonclick.setText("Pulsar");
		botonclick.setOnAction(e->hazmeClick());
		
		Button botonCerrar = new Button();
		botonCerrar.setText("Cerar");
		botonCerrar.setOnAction(e->botonCerrar());
		
		VBox miPane = new VBox(10);
		miPane.getChildren().addAll(botonclick,botonCerrar);
		miPane.setAlignment(Pos.CENTER);
		
		Scene miScene = new Scene(miPane,350,200);
		
		primaryStage.setScene(miScene);
		
		primaryStage.setTitle("Contador de click");
		
		primaryStage.setOnCloseRequest(e->{
			
			e.consume();
			botonCerrar();
		
		
		});
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public void hazmeClick() {
		
		contadorDeClicks++;
		
		if(contadorDeClicks==1) VentanaDialogo.mostrar("Has echo clic una vez","¡Click!");
		
		else VentanaEmergente.mostrar("Has hecho clic " + contadorDeClicks + " veces.", "¡Click");
		
		
	}
	
	public void botonCerrar() {
		
		boolean confirmar=false;
		
		confirmar = VentanaDialogo.mostrar("¿Estas seguro de salir?", "Saliendo.....");
		
		if (confirmar) {
			
			//aquí iría todas aquellas tareas a realizar antes de cerrar
			
			miStage.close();
			
			
			
		}
		
	}
}
