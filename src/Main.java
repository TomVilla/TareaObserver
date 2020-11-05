import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	private Ventana vent;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		vent = new Ventana();
		primaryStage.setScene(vent.getScene());
		primaryStage.setTitle("Botones");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
