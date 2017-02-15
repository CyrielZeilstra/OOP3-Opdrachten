import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * Created by arch on 2/13/17.
 */

public class opgave1 extends Application {

    /**
     * Created by arch on 2/15/17.
     */

    static TextArea txtArea;

    public static synchronized void appendtxtArea(String s){
        txtArea.appendText(s);
    }

    @Override
    public void start(Stage stage) {
        txtArea = new TextArea();
        Scene scene = new Scene(new Group(txtArea));

        stage.setTitle("GUI");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();

// Create tasks
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);

// Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


// The task for printing a character a specified number of times    c
class PrintChar implements Runnable {
    private char charToPrint;
// The character to print

    private int times;

// The number of times to repeat

    /**
     * Construct a task with a specified character and number of
     * <p>
     * times to print the character
     */

    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }

    @Override
/** Override the run() method to tell the system
 *  what task to perform
 */
    public void run() {
        for (int i = 0; i < times; i++) {
            opgave1.appendtxtArea(Character.toString(charToPrint));
        }
    }
}
// The task class for printing numbers from 1 to n for a given n

class PrintNum implements Runnable {
    private int lastNum;

    /**
     * Construct a task for printing 1, 2, ..., n
     */

    public PrintNum(int n) {
        lastNum = n;
    }

    @Override
/** Tell the thread how to run */

    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            opgave1.appendtxtArea(" " + i);
        }
    }
}
