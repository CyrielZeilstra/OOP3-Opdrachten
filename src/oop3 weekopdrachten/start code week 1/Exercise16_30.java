package oop3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise16_30 extends Application {
  private int[][] numbers = new int[6][7];
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    Label lblStatus = new Label();
    
    GridPane gridPane = new GridPane();
    gridPane.setAlignment(Pos.CENTER);
    TextField[][] tfValues = new TextField[6][7];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 7; j++) {
        tfValues[i][j] = new TextField((int)(Math.random() * 10) + "");
        tfValues[i][j].setPrefColumnCount(1);
        gridPane.add(tfValues[i][j], j, i);
      }
    }
    
    BorderPane pane = new BorderPane();
    Button btSolve = new Button("Solve");
    pane.setTop(lblStatus);
    BorderPane.setAlignment(lblStatus, Pos.CENTER);
    pane.setCenter(gridPane);
    pane.setBottom(btSolve);
    BorderPane.setAlignment(btSolve, Pos.CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("Exercise16_30"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    btSolve.setOnAction(e -> {
        for (int i = 0; i < numbers.length; i++)
          for (int j = 0; j < numbers[i].length; j++) {
            tfValues[i][j].setStyle("-fx-background: white");
            if (tfValues[i][j].getText().trim().length() == 0) {
              lblStatus.setText("All cells must be filled with numbers");
              return;
            }
            else 
              numbers[i][j] = Integer.parseInt(tfValues[i][j].getText().trim());
          }
        
        int[][] result = isConsecutiveFour(numbers);
        if (result != null) {
          lblStatus.setText("A consecutive four found");   
          tfValues[result[0][0]][result[0][1]].setStyle("-fx-background: red");
          tfValues[result[1][0]][result[1][1]].setStyle("-fx-background: red");
          tfValues[result[2][0]][result[2][1]].setStyle("-fx-background: red");
          tfValues[result[3][0]][result[3][1]].setStyle("-fx-background: red");
        }
        else {
          lblStatus.setText("No four consecutive numbers in a row, a column, or a diagonal");          
        }
    });
  }

  public static int[][] isConsecutiveFour(int[][] values) {
    int numberOfRows = values.length;
    int numberOfColumns = values[0].length;
    int[][] a = new int[5][5];

    // Check rows

    // Check columns
    return a;
  }
  
  public static Integer isConsecutiveFour(int[] values) {    
    for (int i = 0; i < values.length - 3; i++) {
      boolean isEqual = true;        
      for (int j = i; j < i + 3; j++) {
        if (values[j] != values[j + 1]) {
          isEqual = false;
          break;
        }
      }
     
      if (isEqual) return new Integer(i);
    }
    
    return null;
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
