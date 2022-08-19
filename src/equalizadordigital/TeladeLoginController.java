/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalizadordigital;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Suporte
 */
public class TeladeLoginController implements Initializable,TelaControlada {

    @FXML
    private TextField LoguinNomeUsuario;
    @FXML
    private PasswordField LoguinSenhaUsuario;
    @FXML
    private Button EntrarMenuPrincipal;
    @FXML
    private Button NovoUsuario;
 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    protected ControladorDeTelas meuControlador;
    @Override
    public void setScreenParent(ControladorDeTelas tela) {
        meuControlador = tela;
    }
    @FXML
    public void trocaTela(){
        meuControlador.setScreen(EqualizadorDigital.tela2);
        //check.setSelected(false);
        EqualizadorDigital.auxStage.setTitle(EqualizadorDigital.tela2);
    }
    
}
