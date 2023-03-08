package TicTacToeJavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

public class Main extends Application {

    static final double STAGE_DEFAULT_WIDTH = 350;
    static final double STAGE_DEFAULT_HEIGHT = 350;
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
        final URL mainResource = getClass().getResource("WelcomeScreen.fxml");
        Objects.requireNonNull(mainResource, "Error in initializing game board. System error occurred.");
        final Parent screen = FXMLLoader.load(mainResource);
        primaryStage.setTitle("Tic Tac Toe");
        final Scene scene = new Scene(screen, STAGE_DEFAULT_WIDTH, STAGE_DEFAULT_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}
