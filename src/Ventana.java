import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Ventana {
	private Scene scene;
	private VBox root;
	final String[] COLORS = {"LightGray","Cyan","Pink"};
	static String colorActual;
	
	public Ventana() {
		root = crearRoot();
		scene = crearEscena();
	}
	
	private HBox crearBotones() {
		HBox contenedor = new HBox();
		for(int i = 0; i < COLORS.length; i++) {
			Button b = new Button(COLORS[i]);
			contenedor.getChildren().addAll(b);
			b.setOnAction(e -> {
				colorActual = b.getText();
				cambiarColor();
			});
		}
		contenedor.setSpacing(25);
		contenedor.setAlignment(Pos.CENTER);
		return contenedor;
	}
	
	private VBox crearRoot() {
		Label titulo = new Label("Botones");
		titulo.setTextFill(Color.BLACK);
		HBox botones = crearBotones();
		VBox vBox = new VBox(titulo,botones);
		vBox.setSpacing(40);
		vBox.setAlignment(Pos.CENTER);
		return vBox;
	}
	
	private Scene crearEscena() {
		Scene sc = new Scene(root,500,300);
		return sc;
	}
	
	
	private void cambiarColor() {
		root.setStyle("-fx-background-color: "+colorActual+";");
	}
	
	
	public Scene getScene() {
		return this.scene;
	}
}
