package TicTacToeJavaFX;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class GameBoardController {

    private String playerOneName, playerTwoName;
    private int turnsCount = 0;
    private String playerOneSymbol;
    private String playerTwoSymbol;
    private String playerOneColor, playerTwoColor;

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

    // this method set the width and height of the buttons which are going to be visible on the game board
    private void setButtonDimensions(double width, double height) {
        btn1.setPrefWidth(width / 3);
        btn2.setPrefWidth(width / 3);
        btn3.setPrefWidth(width / 3);
        btn4.setPrefWidth(width / 3);
        btn5.setPrefWidth(width / 3);
        btn6.setPrefWidth(width / 3);
        btn7.setPrefWidth(width / 3);
        btn8.setPrefWidth(width / 3);
        btn9.setPrefWidth(width / 3);

        btn1.setPrefHeight(height / 3);
        btn2.setPrefHeight(height / 3);
        btn3.setPrefHeight(height / 3);
        btn4.setPrefHeight(height / 3);
        btn5.setPrefHeight(height / 3);
        btn6.setPrefHeight(height / 3);
        btn7.setPrefHeight(height / 3);
        btn8.setPrefHeight(height / 3);
        btn9.setPrefHeight(height / 3);
    }

    public void initialize() {
        setButtonDimensions(Main.STAGE_DEFAULT_WIDTH, Main.STAGE_DEFAULT_HEIGHT);
        setButtonsFont(Main.BUTTON_DEFAULT_FONT_SIZE);

        if (WelcomeScreenController.getPlayerOneName().equals("")) {
            playerOneName = "Player 1";
        } else {
            playerOneName = WelcomeScreenController.getPlayerOneName();
        }

        if (WelcomeScreenController.getPlayerTwoName().equals("")) {
            playerTwoName = "Player 2";
        } else {
            playerTwoName = WelcomeScreenController.getPlayerTwoName();
        }

        playerOneSymbol = WelcomeScreenController.getPlayerOneSymbol();
        playerTwoSymbol = WelcomeScreenController.getPlayerTwoSymbol();

        playerOneColor = WelcomeScreenController.getPlayerOneColor();
        playerTwoColor = WelcomeScreenController.getPlayerTwoColor();

        btn1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (turnsCount % 2 == 0 && btn1.getText().equals("")) {
                    turnsCount++;
                    btn1.setText(playerOneSymbol);
                    btn1.setTextFill(Paint.valueOf(playerOneColor));
                } else if (turnsCount % 2 != 0 && btn1.getText().equals("")) {
                    turnsCount++;
                    btn1.setText(playerTwoSymbol);
                    btn1.setTextFill(Paint.valueOf(playerTwoColor));
                }
                resultTest(Main.getPrimaryStage(), btn1.getText());
            }
        });

        btn2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (turnsCount % 2 == 0 && btn2.getText().equals("")) {
                    turnsCount++;
                    btn2.setText(playerOneSymbol);
                    btn2.setTextFill(Paint.valueOf(playerOneColor));
                } else if (turnsCount % 2 != 0 && btn2.getText().equals("")) {
                    turnsCount++;
                    btn2.setText(playerTwoSymbol);
                    btn2.setTextFill(Paint.valueOf(playerTwoColor));
                }
                resultTest(Main.getPrimaryStage(), btn2.getText());
            }
        });

        btn3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (turnsCount % 2 == 0 && btn3.getText().equals("")) {
                    turnsCount++;
                    btn3.setText(playerOneSymbol);
                    btn3.setTextFill(Paint.valueOf(playerOneColor));
                } else if (turnsCount % 2 != 0 && btn3.getText().equals("")) {
                    turnsCount++;
                    btn3.setText(playerTwoSymbol);
                    btn3.setTextFill(Paint.valueOf(playerTwoColor));
                }
                resultTest(Main.getPrimaryStage(), btn3.getText());
            }
        });

        btn4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (turnsCount % 2 == 0 && btn4.getText().equals("")) {
                    turnsCount++;
                    btn4.setText(playerOneSymbol);
                    btn4.setTextFill(Paint.valueOf(playerOneColor));
                } else if (turnsCount % 2 != 0 && btn4.getText().equals("")) {
                    turnsCount++;
                    btn4.setText(playerTwoSymbol);
                    btn4.setTextFill(Paint.valueOf(playerTwoColor));
                }
                resultTest(Main.getPrimaryStage(), btn4.getText());
            }
        });

        btn5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (turnsCount % 2 == 0 && btn5.getText().equals("")) {
                    turnsCount++;
                    btn5.setText(playerOneSymbol);
                    btn5.setTextFill(Paint.valueOf(playerOneColor));
                } else if (turnsCount % 2 != 0 && btn5.getText().equals("")) {
                    turnsCount++;
                    btn5.setText(playerTwoSymbol);
                    btn5.setTextFill(Paint.valueOf(playerTwoColor));
                }
                resultTest(Main.getPrimaryStage(), btn5.getText());
            }
        });

        btn6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (turnsCount % 2 == 0 && btn6.getText().equals("")) {
                    turnsCount++;
                    btn6.setText(playerOneSymbol);
                    btn6.setTextFill(Paint.valueOf(playerOneColor));
                } else if (turnsCount % 2 != 0 && btn6.getText().equals("")) {
                    turnsCount++;
                    btn6.setText(playerTwoSymbol);
                    btn6.setTextFill(Paint.valueOf(playerTwoColor));
                }
                resultTest(Main.getPrimaryStage(), btn6.getText());
            }
        });

        btn7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (turnsCount % 2 == 0 && btn7.getText().equals("")) {
                    turnsCount++;
                    btn7.setText(playerOneSymbol);
                    btn7.setTextFill(Paint.valueOf(playerOneColor));
                } else if (turnsCount % 2 != 0 && btn7.getText().equals("")) {
                    turnsCount++;
                    btn7.setText(playerTwoSymbol);
                    btn7.setTextFill(Paint.valueOf(playerTwoColor));
                }
                resultTest(Main.getPrimaryStage(), btn7.getText());
            }
        });

        btn8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (turnsCount % 2 == 0 && btn8.getText().equals("")) {
                    turnsCount++;
                    btn8.setText(playerOneSymbol);
                    btn8.setTextFill(Paint.valueOf(playerOneColor));
                } else if (turnsCount % 2 != 0 && btn8.getText().equals("")) {
                    turnsCount++;
                    btn8.setText(playerTwoSymbol);
                    btn8.setTextFill(Paint.valueOf(playerTwoColor));
                }
                resultTest(Main.getPrimaryStage(), btn8.getText());
            }
        });

        btn9.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (turnsCount % 2 == 0 && btn9.getText().equals("")) {
                    turnsCount++;
                    btn9.setText(playerOneSymbol);
                    btn9.setTextFill(Paint.valueOf(playerOneColor));
                } else if (turnsCount % 2 != 0 && btn9.getText().equals("")) {
                    turnsCount++;
                    btn9.setText(playerTwoSymbol);
                    btn9.setTextFill(Paint.valueOf(playerTwoColor));
                }
                resultTest(Main.getPrimaryStage(), btn9.getText());
            }
        });
    }

    // this method set the font size of the text which will be visible on the button (either 'O' or 'X')
    private void setButtonsFont(double font) {
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

    // this method check the all possible conditions of winning of a player and
    // also check for draw case when all blocks are filled with the data provided by the players playing game
    private void resultTest(Stage primaryStage, String buttonText) {
        if (btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText()) &&
                !btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("")) {
            System.out.println("Game Over");
            gameOverDialog(primaryStage, buttonText);
        } else if (btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText()) &&
                !btn1.getText().equals("") && !btn4.getText().equals("") && !btn7.getText().equals("")) {
            System.out.println("Game Over");
            gameOverDialog(primaryStage, buttonText);
        } else if (btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText()) &&
                !btn3.getText().equals("") && !btn6.getText().equals("") && !btn9.getText().equals("")) {
            System.out.println("Game Over");
            gameOverDialog(primaryStage, buttonText);
        } else if (btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText()) &&
                !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
            System.out.println("Game Over");
            gameOverDialog(primaryStage, buttonText);
        } else if (btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText()) &&
                !btn3.getText().equals("") && !btn5.getText().equals("") && !btn7.getText().equals("")) {
            System.out.println("Game Over");
            gameOverDialog(primaryStage, buttonText);
        } else if (btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()) &&
                !btn1.getText().equals("") && !btn5.getText().equals("") && !btn9.getText().equals("")) {
            System.out.println("Game Over");
            gameOverDialog(primaryStage, buttonText);
        } else if (btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText()) &&
                !btn2.getText().equals("") && !btn5.getText().equals("") && !btn8.getText().equals("")) {
            System.out.println("Game Over");
            gameOverDialog(primaryStage, buttonText);
        } else if (btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) &&
                !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("")) {
            System.out.println("Game Over");
            gameOverDialog(primaryStage, buttonText);
        } else {
            if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") &&
                    !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
                System.out.println("Game Draw");
                gameOverDialog(primaryStage, "Draw");
            }
        }
    }

    // this method is used to display the final result of the game
    // this method will be called only when either any of player wins the game
    // or game get draw. In other cases, this method will not be called by resultTest method
    private void gameOverDialog(Stage primaryStage, String buttonText) {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("GameResult.fxml"));
        GameResultController gameResultController = null;

        try {
            primaryStage.setScene(new Scene(fxmlLoader.load(), Main.STAGE_DEFAULT_WIDTH, Main.STAGE_DEFAULT_HEIGHT));
            gameResultController = fxmlLoader.getController();

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