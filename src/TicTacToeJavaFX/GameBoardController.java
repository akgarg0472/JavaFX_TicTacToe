package TicTacToeJavaFX;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

@SuppressWarnings({"UnusedDeclaration", "SameParameterValue"})
public class GameBoardController {

    private String playerOneName, playerTwoName;
    private String playerOneSymbol;
    private String playerTwoSymbol;
    private String playerOneColor, playerTwoColor;
    private int turnsCount = 0;

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;

    public void initialize() {
        this.setButtonDimensions();
        this.setButtonsFont(Main.BUTTON_DEFAULT_FONT_SIZE);

        this.playerOneName = WelcomeScreenController.getPlayerOneName();
        this.playerTwoName = WelcomeScreenController.getPlayerTwoName();

        this.playerOneSymbol = WelcomeScreenController.getPlayerOneSymbol();
        this.playerTwoSymbol = WelcomeScreenController.getPlayerTwoSymbol();

        this.playerOneColor = WelcomeScreenController.getPlayerOneColor();
        this.playerTwoColor = WelcomeScreenController.getPlayerTwoColor();

        this.buttonClickHandler(btn1, btn2, btn3, btn4);
        this.buttonClickHandler(btn5, btn6, btn7, btn8);
        this.buttonClickHandlerTwo(btn9);
    }

    private void buttonClickHandler(
            final Button btn1,
            final Button btn2,
            final Button btn3,
            final Button btn4
    ) {
        this.clickHandler(btn1, btn2);
        this.clickHandler(btn3, btn4);
    }

    private void clickHandler(
            final Button btn1,
            final Button btn2
    ) {
        this.buttonClickHandlerTwo(btn1);
        this.buttonClickHandlerTwo(btn2);
    }

    private void buttonClickHandlerTwo(final Button button) {
        button.setOnMouseClicked(event -> {
            if (turnsCount % 2 == 0 && button.getText().equals("")) {
                turnsCount++;
                button.setText(playerOneSymbol);
                button.setTextFill(Paint.valueOf(playerOneColor));
            } else if (turnsCount % 2 != 0 && button.getText().equals("")) {
                turnsCount++;
                button.setText(playerTwoSymbol);
                button.setTextFill(Paint.valueOf(playerTwoColor));
            }
            resultTest(Main.getPrimaryStage(), button.getText());
        });
    }

    // this method set the font size of the text which will be visible on the button (either 'O' or 'X')
    private void setButtonsFont(final double font) {
        Font font1 = new Font(font);
        btn1.setFont(font1);
        btn2.setFont(font1);
        btn3.setFont(font1);
        btn4.setFont(font1);
        btn5.setFont(font1);
        btn6.setFont(font1);
        btn7.setFont(font1);
        btn8.setFont(font1);
        btn9.setFont(font1);
    }

    // this method set the width and height of the buttons which are going to be visible on the game board
    private void setButtonDimensions() {
        final double buttonWidth = Main.STAGE_DEFAULT_WIDTH / 3;
        final double buttonHeight = Main.STAGE_DEFAULT_HEIGHT / 3;

        btn1.setPrefSize(buttonWidth, buttonHeight);
        btn2.setPrefSize(buttonWidth, buttonHeight);
        btn3.setPrefSize(buttonWidth, buttonHeight);
        btn4.setPrefSize(buttonWidth, buttonHeight);
        btn5.setPrefSize(buttonWidth, buttonHeight);
        btn6.setPrefSize(buttonWidth, buttonHeight);
        btn7.setPrefSize(buttonWidth, buttonHeight);
        btn8.setPrefSize(buttonWidth, buttonHeight);
        btn9.setPrefSize(buttonWidth, buttonHeight);
    }

    // this method check the all possible conditions of winning of a player and
    // also check for draw case when all blocks are filled with the data provided by the players playing game
    private void resultTest(final Stage primaryStage, final String buttonText) {
        final String buttonOneText = btn1.getText();
        final String buttonTwoText = btn2.getText();
        final String buttonThreeText = btn3.getText();

        if (buttonOneText.equals(buttonTwoText) && buttonTwoText.equals(buttonThreeText) && !buttonOneText.equals("")) {
            gameOverDialog(primaryStage, buttonText);
        } else {
            final String buttonSevenText = btn7.getText();
            final String buttonFourText = btn4.getText();

            if (buttonOneText.equals(buttonFourText) && buttonFourText.equals(buttonSevenText) && !buttonOneText.equals("")) {
                gameOverDialog(primaryStage, buttonText);
            } else {
                final String buttonSixText = btn6.getText();
                final String buttonNineText = btn9.getText();

                if (buttonThreeText.equals(buttonSixText) && buttonSixText.equals(buttonNineText) && !buttonThreeText.equals("")) {
                    gameOverDialog(primaryStage, buttonText);
                } else {
                    final String buttonEightText = btn8.getText();

                    if (buttonSevenText.equals(buttonEightText) && buttonEightText.equals(buttonNineText) && !buttonSevenText.equals("")) {
                        gameOverDialog(primaryStage, buttonText);
                    } else {
                        final String buttonFiveText = btn5.getText();

                        if (buttonThreeText.equals(buttonFiveText) && buttonFiveText.equals(buttonSevenText) && !buttonThreeText.equals("")) {
                            gameOverDialog(primaryStage, buttonText);
                        } else if (buttonOneText.equals(buttonFiveText) && buttonFiveText.equals(buttonNineText) && !buttonOneText.equals("")) {
                            gameOverDialog(primaryStage, buttonText);
                        } else if (buttonTwoText.equals(buttonFiveText) && buttonFiveText.equals(buttonEightText) && !buttonTwoText.equals("")) {
                            gameOverDialog(primaryStage, buttonText);
                        } else if (buttonFourText.equals(buttonFiveText) && buttonFiveText.equals(buttonSixText) && !buttonFourText.equals("")) {
                            gameOverDialog(primaryStage, buttonText);
                        } else {
                            if (!buttonOneText.equals("") && !buttonTwoText.equals("") && !buttonThreeText.equals("") && !buttonFourText.equals("") && !buttonFiveText.equals("") && !buttonSixText.equals("") && !buttonSevenText.equals("") && !buttonEightText.equals("") && !buttonNineText.equals("")) {
                                gameOverDialog(primaryStage, "Draw");
                            }
                        }
                    }
                }
            }
        }
    }

    // this method is used to display the final result of the game
    // this method will be called only when either any of player wins the game
    // or game get draw. In other cases, this method will not be called by resultTest method
    private void gameOverDialog(final Stage primaryStage, final String buttonText) {
        final FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("GameResult.fxml"));
        GameResultController gameResultController;

        try {
            primaryStage.setScene(new Scene(fxmlLoader.load(), Main.STAGE_DEFAULT_WIDTH, Main.STAGE_DEFAULT_HEIGHT));
            gameResultController = fxmlLoader.getController();
            Objects.requireNonNull(gameResultController);

            if (buttonText.equals("Draw")) {
                gameResultController.setGameResultText("Draw", "");
            } else {
                if (playerOneSymbol.equals(buttonText)) {
                    gameResultController.setGameResultText("win", playerOneName);
                } else {
                    gameResultController.setGameResultText("win", playerTwoName);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}