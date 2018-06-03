package au.edu.usc.bict_explorer.rules;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class kjk extends Application {
   public ListCourses obj = new ListCourses() ;



    public static void main(String[] args) throws IOException {
        kjk obj = new kjk();
     //   obj.callreadfile();
      //  obj.initialize();
        launch(args);
    }
public void callreadfile() throws IOException {
    obj.readfile();
}
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("listCourses.fxml"));
      //  Label label = new Label("My Label");
        Scene scene = new Scene(root, 580, 620);

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(scene);
     //   primaryStage.

        primaryStage.show();


    }
}
