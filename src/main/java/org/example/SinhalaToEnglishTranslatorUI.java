package org.example;

import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import org.example.controller.SinhalaToEnglishTranslator;

public class SinhalaToEnglishTranslatorUI {

    private final GridPane root;

    public SinhalaToEnglishTranslatorUI() {
        // Create UI components
        Label inputLabel = new Label("Input:");
        inputLabel.setStyle("-fx-font-size: 14px ;-fx-text-fill:black;-fx-font-family: 'Baloo Bhai 2'");
        TextArea inputTextArea = new TextArea();
        inputTextArea.setStyle("-fx-background-color: #DBE7C9;");
        Label outputLabel = new Label("Output:");
        outputLabel.setStyle("-fx-font-size: 14px;-fx-text-fill:black; -fx-font-family: 'Baloo Bhai 2'");
        TextArea outputTextArea = new TextArea();
        outputTextArea.setStyle("-fx-background-color: #DBE7C9;");
        Button translateButton = new Button("Translate");


        translateButton.setStyle("-fx-background-color:#A7D397; -fx-font-size: 14px;");
        translateButton.setOnMouseEntered(event -> translateButton.setStyle("-fx-background-color:#A3B763 ; -fx-font-size: 14px; "));
        translateButton.setCursor(Cursor.HAND);

        //translateButton.setOnMouseEntered(event -> translateButton.setStyle("-fx-background-color: red; -fx-font-size: 14px; -fx-text-fill: pink;"));

        // Set event handler for the translateButto
        translateButton.setOnAction(event -> {
            String inputText = inputTextArea.getText();
            String translatedText = SinhalaToEnglishTranslator.translateToEnglish(inputText);
            outputTextArea.setText(translatedText);
        });

        // Layout the components
        root = new GridPane();
        root.setPadding(new Insets(10));
        root.setVgap(6);
        root.setHgap(6);
        root.setStyle("-fx-background-color:#DADDB1;");
       // root.setPrefSize(400, 200);

        root.add(inputLabel, 0, 0);
        root.add(inputTextArea, 0, 1);
        root.add(outputLabel, 0, 2);
        root.add(outputTextArea, 0, 3);
        root.add(translateButton, 0, 4);
    }

    public GridPane getRootNode() {
        return root;
    }
}
