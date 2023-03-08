package TicTacToeJavaFX;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

@SuppressWarnings("UnusedDeclaration")
public class WelcomeScreenController {

    private static final String PLAYER_ONE_DEFAULT_NAME = "Player 1";
    private static final String PLAYER_TWO_DEFAULT_NAME = "Player 2";
    private static final Font font = new Font(14);

    private static String playerOneName;
    private static String playerTwoName;
    private static String playerOneSymbol;
    private static String playerTwoSymbol;
    private static String playerOneColor;
    private static String playerTwoColor;

    @FXML
    private Label playerOneNameLabel;
    @FXML
    private TextField playerOneNameField;
    @FXML
    private Label playerTwoNameLabel;
    @FXML
    private TextField playerTwoNameField;
    @FXML
    private Label playerOneSymbolLabel;
    @FXML
    private RadioButton crossSymbol;
    @FXML
    private RadioButton zeroSymbol;
    @FXML
    private Label playerOneColorLabel;
    @FXML
    private ColorPicker playerOneColorPicker;
    @FXML
    private Label playerTwoColorLabel;
    @FXML
    private ColorPicker playerTwoColorPicker;
    @FXML
    private Button startGameButton;

    static String getPlayerOneName() {
        return playerOneName;
    }

    static String getPlayerTwoName() {
        return playerTwoName;
    }

    static String getPlayerOneSymbol() {
        return playerOneSymbol;
    }

    static String getPlayerTwoSymbol() {
        return playerTwoSymbol;
    }

    static String getPlayerOneColor() {
        return playerOneColor;
    }

    static String getPlayerTwoColor() {
        return playerTwoColor;
    }

    public void initialize() {
        final ToggleGroup toggleGroup = new ToggleGroup();
        crossSymbol.setToggleGroup(toggleGroup);
        zeroSymbol.setToggleGroup(toggleGroup);

        playerOneName = PLAYER_ONE_DEFAULT_NAME;
        playerTwoName = PLAYER_TWO_DEFAULT_NAME;

        playerOneNameLabel.setFont(font);
        playerTwoNameLabel.setFont(font);
        playerOneSymbolLabel.setFont(font);
        playerOneColorLabel.setFont(font);
        playerTwoColorLabel.setFont(font);

        playerOneColorPicker.setValue(Color.BLACK);
        playerTwoColorPicker.setValue(Color.BLACK);

        this.startGameButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                final String _playerOneName = playerOneNameField.getText();
                if (Utils.isStringValid(_playerOneName)) {
                    playerOneName = _playerOneName;
                }

                final String _playerTwoName = playerTwoNameField.getText();
                if (Utils.isStringValid(_playerTwoName)) {
                    playerTwoName = _playerTwoName;
                }

                if (crossSymbol.isSelected()) {
                    playerOneSymbol = "X";
                    playerTwoSymbol = "O";
                } else {
                    playerOneSymbol = "O";
                    playerTwoSymbol = "X";
                }

                playerOneColor = playerOneColorPicker.getValue().toString();
                playerTwoColor = playerTwoColorPicker.getValue().toString();

                try {
                    final URL gameBoardResource = getClass().getResource("GameBoard.fxml");
                    Objects.requireNonNull(gameBoardResource, "Error loading game board screen");
                    final Parent root = FXMLLoader.load(gameBoardResource);
                    final Scene scene = new Scene(root, Main.STAGE_DEFAULT_WIDTH, Main.STAGE_DEFAULT_HEIGHT);
                    Main.getPrimaryStage().setScene(scene);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}