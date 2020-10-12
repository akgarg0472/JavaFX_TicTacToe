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

public class WelcomeScreenController {

    private static final Font font = new Font(14);
    private static String playerOneName;
    private static String playerTwoName;
    private static String playerOneSymbol;
    private static String playerTwoSymbol;
    private static String playerOneColor;
    private static String playerTwoColor;

    private ToggleGroup toggleGroup;
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
        toggleGroup = new ToggleGroup();
        crossSymbol.setToggleGroup(toggleGroup);
        zeroSymbol.setToggleGroup(toggleGroup);

        playerOneNameLabel.setFont(font);
        playerTwoNameLabel.setFont(font);
        playerOneSymbolLabel.setFont(font);
        playerOneColorLabel.setFont(font);
        playerTwoColorLabel.setFont(font);

        playerOneColorPicker.setValue(Color.BLACK);
        playerTwoColorPicker.setValue(Color.BLACK);

        startGameButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                playerOneName = playerOneNameField.getText();
                playerTwoName = playerTwoNameField.getText();

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
                    Parent root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
                    Scene scene = new Scene(root, Main.STAGE_DEFAULT_WIDTH, Main.STAGE_DEFAULT_HEIGHT);
                    Main.getPrimaryStage().setScene(scene);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
