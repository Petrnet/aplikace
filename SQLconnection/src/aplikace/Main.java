package aplikace;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass()
		          .getResource
		          ("Login.fxml"));
		Parent root = loader.load();
		LoginController controller = loader.getController();
		
        primaryStage.setTitle("Rezervace");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
		
	}

}