package application;
	
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import emergente.*;

public class Main extends Application {
	int contador;
	private Label miTexto = new Label();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			contador = 0;
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			Button miBoton = new Button("Haz click aquí!");
			miBoton.setOnAction(e ->clickEnBoton());
			root.setCenter(miBoton);
			
			miTexto.setText("Hiciste click " + contador + " veces.");
			root.setTop(miTexto);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void clickEnBoton() {
		
		/*contador++;
		
		if(contador==1) miTexto.setText("Hiciste click " + contador + " vez.");
		else miTexto.setText("Hiciste click " + contador + " veces.");*/
		//VentanaEmergente.mostrar("Ventana Emergente" ,"Ojo, Cuidado" );
		boolean resultado = VentanaDialogo.mostrar("Ventana Emergente" ,"Ojo, Cuidado" );
		
		System.out.println(resultado);
	}
}
