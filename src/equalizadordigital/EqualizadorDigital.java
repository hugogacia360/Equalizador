package equalizadordigital;
import java.io.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author Nikolas
 * alterar slide 15
 */
public class EqualizadorDigital extends Application {
    public static String tela1 = "Login", tela1Arquivo = "TeladeLogin.fxml";
    public static String tela2 = "TelaCadastrar", tela2Arquivo = "CadastroUsuario.fxml";
    public static String tela3 = "Menu", tela3Arquivo = "MenuPrincipal.fxml";
    public static String tela4 = "NovoAjuste", tela4Arquivo = "TelaNovoAjuste.fxml";
    public static String tela5 = "Edicao", tela5Arquivo = "TeladeEdicao.fxml";
    public static String tela6 = "Lista", tela6Arquivo = "TelaLista.fxml";
    protected static Stage auxStage;
    @Override
    public void start(Stage primaryStage) throws IOException{
        auxStage = primaryStage;
        ControladorDeTelas mainContainer = new ControladorDeTelas();
        mainContainer.carregaTela(EqualizadorDigital.tela1, EqualizadorDigital.tela1Arquivo);
        mainContainer.carregaTela(EqualizadorDigital.tela2, EqualizadorDigital.tela2Arquivo);
        mainContainer.carregaTela(EqualizadorDigital.tela3, EqualizadorDigital.tela3Arquivo);
        mainContainer.carregaTela(EqualizadorDigital.tela4, EqualizadorDigital.tela4Arquivo);
        mainContainer.carregaTela(EqualizadorDigital.tela5, EqualizadorDigital.tela5Arquivo);
        mainContainer.carregaTela(EqualizadorDigital.tela6, EqualizadorDigital.tela6Arquivo);        
        mainContainer.setScreen(EqualizadorDigital.tela1);        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.sizeToScene();
        primaryStage.setResizable(false);
    }
    
    public static void main(String[] args) {
        launch(args);
    }    
}