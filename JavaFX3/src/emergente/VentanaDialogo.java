package emergente;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.scene.*;

public class VentanaDialogo {
	
	private static Stage miStage;
	
	private static boolean botonSiPulsado;
	
	public static boolean mostrar(String mensaje, String titulo) {
		
		botonSiPulsado=false;
		
		miStage = new Stage();
		
		miStage.initModality(Modality.APPLICATION_MODAL);
	
		miStage.setTitle(titulo);
		
		miStage.setMinWidth(250);
		
		Label miLabel = new Label();
		
		miLabel.setText(mensaje);
		
		// Creación boton Si
		
		Button miBotonSi = new Button();
		
		miBotonSi.setText("Si");
		
		miBotonSi.setOnAction(e->miBotonSi_clicked());
		
		// Creación botón No
		
		Button miBotonNo = new Button();
		
		miBotonNo.setText("NO");
		
		miBotonNo.setOnAction(e->miBotonNo_clicked());
		
		//BorderPane miPane = new BorderPane();
		
		HBox panelBotones = new HBox(20);
		
		panelBotones.getChildren().addAll(miBotonSi,miBotonNo);
		
		panelBotones.setAlignment(Pos.CENTER);
		
		VBox panelVertical = new VBox(20);
		
		panelVertical.getChildren().addAll(miLabel,panelBotones);
		
		panelVertical.setAlignment(Pos.CENTER);
		
		Scene miScene = new Scene(panelVertical);
		
		miStage.setScene(miScene);
		
		miStage.showAndWait();
		
		return botonSiPulsado;
		
		
	}

	private static void miBotonNo_clicked() {
		// TODO Auto-generated method stub
		miStage.close();
		
		botonSiPulsado=false;
	}

	private static void miBotonSi_clicked() {
		// TODO Auto-generated method stub
		miStage.close();
		
		botonSiPulsado=true;
	}
	
	
	
}
