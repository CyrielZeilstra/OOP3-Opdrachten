import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BallPane p = new BallPane();
        Scene s = new Scene(p, 250, 150);
        primaryStage.setTitle("Ball");
        primaryStage.setScene(s);
        primaryStage.show();
        primaryStage.requestFocus();
    }
}

