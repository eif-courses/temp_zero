package eif.viko.lt.pagrindai;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("start.fxml"));

    Scene scene = new Scene(root, 1024, 768);
    stage.setTitle("FXML Welcome");
    stage.setScene(scene);
    stage.show();
  }
}
