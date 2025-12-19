package com.hust.kstn.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.event.*;
import javafx.scene.input.MouseEvent;

public class PainterController {

    private Color color;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup toolGroup;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle circle = new Circle(event.getX(), event.getY(), 4, color);
        drawingAreaPane.getChildren().add(circle);
    }

    @FXML
    void penButtonPressed(ActionEvent event) {
        color = Color.BLACK;
    }

    @FXML
    void eraserButtonPressed(ActionEvent event) {
        color = Color.WHITE;
    }
}
