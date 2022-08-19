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
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Suporte
 */
public class TelaNovoAjusteController implements Initializable, TelaControlada {

    @FXML
    private Slider novoGravesbarra;
    @FXML
    private Slider novoMediobarra;
    @FXML
    private Slider novoAgudobarra;
    @FXML
    private Slider novoVolumebarra;
    @FXML
    private TextField nomeNovoPreset;
    @FXML
    private TextField novoGravesvalor;
    @FXML
    private TextField novoAgudovalor;
    @FXML
    private TextField novoMediovalor;
    @FXML
    private Button botaoSalvarAjuste;
    @FXML
    private Button botaoCancelar;

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
