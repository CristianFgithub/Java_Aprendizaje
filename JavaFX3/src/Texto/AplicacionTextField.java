package Texto;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AplicacionTextField extends Application {

	
	TextField txtEquipo, txtJugador, txtpuntos;
	
	
	@Override
	public void start(Stage primaryStage) {
		
		// Etiqueta del equipo
		
		Label lbEquipo = new Label("Nombre del Equipo: ");
		
		lbEquipo.setMinWidth(100);
		
		lbEquipo.setAlignment(Pos.BOTTOM_RIGHT);
		
		//campo de text (Textfield) del equipo
		
		txtEquipo = new TextField("Nombre del equipo");
		
		txtEquipo.setMinWidth(200);
		
		txtEquipo.setMaxWidth(200);
		
		// Etiqueta del jugador
		
		Label lbjugador = new Label("Nombre del Jugador: ");
		
		lbjugador.setMinWidth(100);
		
		lbjugador.setAlignment(Pos.BOTTOM_RIGHT);
		
		//campo de text (Textfield) del juygador
		
		txtJugador = new TextField("Nombre del Jugador");
		
		txtJugador.setMinWidth(200);
		
		txtJugador.setMaxWidth(200);
		
		// Etiqueta de los puntos
		
		Label lbPuntos = new Label("Puntos:");
		
		lbPuntos.setMinWidth(100);
		
		lbPuntos.setAlignment(Pos.BOTTOM_RIGHT);
		
		//campo de text (Textfield) del equipo
		
		txtpuntos = new TextField("Cuantos puntos hace");
		
		txtpuntos.setMinWidth(200);
		
		txtpuntos.setMaxWidth(200);
		
		// Creación del botón
		
		Button btAccion = new Button("Dale");
		
		btAccion.setMinWidth(80);
		
		btAccion.setMaxWidth(80);
		
		btAccion.setOnAction(e->btAccionClick());
		
		// Creación del Pane del equipo
		
		HBox paneEquipo = new HBox(20,lbEquipo,txtEquipo);
		
		paneEquipo.setPadding(new Insets(10));
		
		// Creación del Pane del jugador
		
		HBox paneJugador = new HBox(20,lbjugador,txtJugador);
		
		paneJugador.setPadding(new Insets(10));
		
		// Creación del Pane de los puntos
		
		HBox panePuntos = new HBox(20,lbPuntos,txtpuntos);
		
		panePuntos.setPadding(new Insets(10));
		
		// Creacion del Pane del botón
		
		HBox paneBoton = new HBox(20,btAccion);
		
		paneBoton.setPadding(new Insets(10));
	
		paneBoton.setAlignment(Pos.BOTTOM_RIGHT);
		
		//Creación del VBox
		
		VBox panelVertical = new VBox(10,paneEquipo,paneJugador,panePuntos,paneBoton);
		
		//Creacion de la Scene
		
		Scene LaScene = new Scene(panelVertical);
		
		primaryStage.setScene(LaScene);
		
		primaryStage.setTitle("Datos del jugador");
		
		primaryStage.show();
		
		
	}


	private void btAccionClick() {
		// TODO Auto-generated method stub
		
		String mensaje="";
		
		
		
	}


	public static void main(String[] args) {
		launch(args);
	}
}
