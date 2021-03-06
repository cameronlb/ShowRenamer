package MVC;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("view/rename.fxml"));
        Scene scene = new Scene(root, 1280, 720);

        root.setId("pane");
        primaryStage.setResizable(false);

        primaryStage.setTitle("Show Renamer");
        primaryStage.setScene(scene);
//        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("images/icon.png")));

        primaryStage.show();
    }
}


