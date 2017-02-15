package opgave1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by arch on 2/15/17.
 */
public class GUI extends Application {
    TextArea txtArea = new TextArea();
    @Override public void start(Stage stage) {

        Scene scene = new Scene(new Group(txtArea));

        stage.setTitle("Welcome to JavaFX!");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    public void setTxtArea(String s){
        txtArea.appendText(s);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
