import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Insets;
import javafx.scene.chart.BarChart;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/*
30.6
(Bouncing balls) Rewrite Listing 15.17 BallPane.java, using a thread to animate bouncing ball movements.
You can find BallPane.java on Blackboard.
All you have to do is add a thread and use Platform.runLater(Runnable)
*/

public class View extends Pane {
    public final double radius = 20;
    private double x = 50;
    private double y = 50;
    private Circle circle = new Circle(x, y, radius);
    private Rectangle bar = new Rectangle(x,y);

    public View() {
        this.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        circle.setFill(Color.GREEN); // Set ball color
        bar.setFill(Color.RED);
        getChildren().add(circle); // Place a ball into this pane
        getChildren().add(bar); // Place a ball into this pane
    }


}