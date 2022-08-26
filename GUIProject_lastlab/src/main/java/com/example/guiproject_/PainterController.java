package com.example.guiproject_;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;
    @FXML
    private RadioButton penButton;
    @FXML
    private RadioButton eraserButton;
    @FXML
    private TextField xcoordinate;
    @FXML
    private TextField ycoordinate;
    @FXML
    void clearButtonPressed() {
        drawingAreaPane.getChildren().clear();
    }
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (2 <= event.getX() && event.getX() <= drawingAreaPane.getWidth()-2) {
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
            xcoordinate.setText(event.getX() + "");
            ycoordinate.setText(event.getY() + "");
        }
    }
    @FXML
    void clearAreaMouseDragged(MouseEvent event) {
        if (5 <= event.getX() && event.getX() <= drawingAreaPane.getWidth() - 5) {
            Circle newCircle = new Circle(event.getX(), event.getY(), 8, Color.WHITE);
            drawingAreaPane.getChildren().add(newCircle);
            xcoordinate.setText(event.getX() + "");
            ycoordinate.setText(event.getY() + "");
        }
    }
    @FXML
    void choosingOption(MouseEvent event) {
        if (penButton.isSelected()){
            drawingAreaMouseDragged(event);
        } else if (eraserButton.isSelected()){
            clearAreaMouseDragged(event);
        }
    }

}

