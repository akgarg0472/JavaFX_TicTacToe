package TicTacToeJavaFX;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.io.IOException;

public class GameResultController {

    @FXML
    private Label congratsLabel;
    @FXML
    private Label winnerName;
    @FXML
    private Label gameOverLabel;
    @FXML
    private Label complementLabel;
    @FXML
    private Button playAgainButton;
    @FXML
    private Button exitGameButton;

    // this method dynamically update the content of the final result scene of the game according to the game result
    void setGameResultText(String gameResultText1, String winner) {
        if (gameResultText1.equals("Draw")) {
            gameOverLabel.setFont(Font.font("Algerian", FontWeight.BOLD, 45));
            congratsLabel.setFont(new Font(35));
            winnerName.setFont(new Font(30));
            congratsLabel.setVisible(false);
            complementLabel.setVisible(false);
            winnerName.setText("Game Draw");
        } else {
            gameOverLabel.setFont(Font.font("Algerian", FontWeight.BOLD, 45));
            congratsLabel.setFont(new Font(35));
            winnerName.setFont(new Font(25));
            congratsLabel.setVisible(true);
            complementLabel.setVisible(true);

            if (winner.length() > 30) {
                winnerName.setText(winner.substring(0, 30));
            } else {
                winnerName.setText(winner);
            }

            winnerName.setWrapText(true);
        }
    }

    public void initialize() {
        playAgainButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    Main.getPrimaryStage().setScene(new Scene
                            (FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml")), Main.STAGE_DEFAULT_WIDTH, Main.STAGE_DEFAULT_HEIGHT));
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        });

        exitGameButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Main.getPrimaryStage().close();
            }
        });
    }
}
