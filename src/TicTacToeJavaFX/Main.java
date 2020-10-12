package TicTacToeJavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static final int STAGE_DEFAULT_WIDTH = 300;
    static final int STAGE_DEFAULT_HEIGHT = 300;
    static final int BUTTON_DEFAULT_FONT_SIZE = 40;

    private static Stage stage;

    // method used to retrieve the primaryStage
    static Stage getPrimaryStage() {
        return stage;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        primaryStage.setTitle("Tic Tac Toe");
        Scene scene = new Scene(root, STAGE_DEFAULT_WIDTH, STAGE_DEFAULT_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
