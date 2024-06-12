import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Puissance4 extends Application {

    @Override 
    public void init() throws Exception {
        
    }
    
    @Override 
    public void start(Stage primarystage) throws Exception{
        // FXMLLoader loader = new FXMLLoader(this.getClass().getResource("file:./src/Page_Accueil.fxml"));
        // BorderPane root = loader.load();
        BorderPane root = new FXMLLoader(this.getClass().getResource("file:./src/Page_Accueil.fxml")).load();
        Scene mainScene = new Scene(root);

        primarystage.setScene(mainScene);
        primarystage.setTitle("test");
        
    }

    public void afficherAcceuil(){

    }

    public void afficherAccueilVSBot(){

    }

    public void afficherAcceuil2Joueur(){

    }

    public void afficherParam(){

    }

    public void afficherJeu(){
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}