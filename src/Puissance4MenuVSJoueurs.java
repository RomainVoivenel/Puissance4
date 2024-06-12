import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Puissance4MenuVSJoueurs extends Application {
    @Override 
    public void init() throws Exception {
        
    }
    
    @Override 
    public void start(Stage primarystage) throws Exception{
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Puissance4.fxml"));
        BorderPane root = loader.load();
        Scene mainScene = new Scene(root);

        primarystage.setScene(mainScene);
        primarystage.setTitle("test");
        
    }
    
    
}