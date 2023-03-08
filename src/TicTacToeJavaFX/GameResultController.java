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
import java.net.URL;
import java.util.Objects;

@SuppressWarnings("UnusedDeclaration")
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

    public void initialize() {
        this.playAgainButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    final URL welcomeScreenResource = getClass().getResource("WelcomeScreen.fxml");
                    Objects.requireNonNull(welcomeScreenResource, "Error loading game welcome screen");

                    Main.getPrimaryStage().setScene(new Scene(
                            FXMLLoader.load(welcomeScreenResource),
                            Main.STAGE_DEFAULT_WIDTH,
                            Main.STAGE_DEFAULT_HEIGHT
                    ));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        exitGameButton.setOnMouseClicked(event -> Main.getPrimaryStage().close());
    }

    // this method dynamically update the content of the final result scene of the game according to the game result
    void setGameResultText(final String gameResultText1, final String winner) {
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

}