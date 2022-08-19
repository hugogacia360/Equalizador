package equalizadordigital;

import java.util.HashMap;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 *
 * @author Nikolas
 */
public class ControladorDeTelas extends Pane {
    private HashMap<String, Node> telas = new HashMap<>();

    public ControladorDeTelas() {
        super();
    }

    public void addTela(String nome, Node tela) {
        telas.put(nome, tela);
    }

    public Node getTela(String nome) {
        return telas.get(nome);
    }

    public boolean carregaTela(String nome, String caminho) {
        try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(caminho));
            Parent loadScreen = (Parent) myLoader.load();
            TelaControlada myScreenControler = ((TelaControlada) myLoader.getController());
            myScreenControler.setScreenParent(this);
            addTela(nome, loadScreen);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean setScreen(final String name) {        
        Node telaParaRemover;
        if (telas.get(name) != null) {   //tela carregada
            if (!getChildren().isEmpty()) {    //se não tem mais de uma tela
                getChildren().add(0, telas.get(name));     //adiciona tela
                telaParaRemover = getChildren().get(1);
                getChildren().remove(1);                    //remove a tela mostrada
                EqualizadorDigital.auxStage.sizeToScene();          //faz com que a janela se ajuste à nova tela       
            } else {
                getChildren().add(telas.get(name));       //nenhuma tela sendo mostrada,então apenas exibe
            }
            return true;
        } else {
            System.out.println("tela não foi carregada!!!\n");
            return false;
        }
    }
    
    /*public boolean setTela(final String nome){
        if (telas.get(nome) != null) {   //screen loaded
            final DoubleProperty opacity = opacityProperty();
            if (!getChildren().isEmpty()) {    //if there is more than one screen
                Timeline fade = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 1.0)),
                        new KeyFrame(new Duration(1000), new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent t) {
                                getChildren().remove(0);                    //remove the displayed screen
                                getChildren().add(0, telas.get(nome));     //add the screen
                                Timeline fadeIn = new Timeline(
                                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                                        new KeyFrame(new Duration(800), new KeyValue(opacity, 1.0)));
                                fadeIn.play();
                                Carregador.auxStage.sizeToScene();
                            }
                        }, new KeyValue(opacity, 0.0)));
                fade.play();

            } else {
                setOpacity(0.0);
                getChildren().add(telas.get(nome));       //no one else been displayed, then just show
                Timeline fadeIn = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                        new KeyFrame(new Duration(2500), new KeyValue(opacity, 1.0)));
                fadeIn.play();
            }
            return true;
        } else {
            System.out.println("screen hasn't been loaded!!! \n");
            return false;
        }
         

    }*/

}
