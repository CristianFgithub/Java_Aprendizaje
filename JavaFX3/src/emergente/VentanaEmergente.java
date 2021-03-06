package emergente;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.*;

public class VentanaEmergente {

	public static void mostrar(String mensaje, String titulo) {
		
		Stage miStage = new Stage();
		
		miStage.initModality(Modality.APPLICATION_MODAL);
	
		miStage.setTitle(titulo);
		
		miStage.setMinWidth(250);
		
		Label miLabel = new Label();
		
		miLabel.setText(mensaje);
		
		Button miBoton = new Button();
		
		miBoton.setText("Cerrar");
		
		miBoton.setOnAction(e->miStage.close());
		
		BorderPane miPane = new BorderPane();
		
		Scene miScene = new Scene(miPane,150,50);
		
		miPane.setTop(miLabel);
		
		miPane.setCenter(miBoton);
		
		miStage.setScene(miScene);
		
		miStage.showAndWait();
		
		
	}
	
	
	
}
