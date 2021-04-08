package edu.wpi.teamname;

import edu.wpi.teamname.views.LabelController;
import edu.wpi.teamname.views.MainController;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {


  @Override
  public void start(Stage primaryStage) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("views/MainView.fxml"));
    loader.setControllerFactory(
        param -> {
          if (param.equals(LabelController.class)) {
            return new LabelController();
          } else {
            return new MainController();
          }
        });
    Parent root = loader.load();
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
