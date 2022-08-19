/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalizadordigital;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Suporte
 */
public class TelaListaController implements Initializable, TelaControlada {

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
    
}
