import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        View p = new View();
        Scene s = new Scene(p, 200, 200);
        primaryStage.setTitle("Bars");
        primaryStage.setScene(s);
        primaryStage.show();
        primaryStage.requestFocus();
    }
}

