package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


    public class Launcher extends Application {

        @Override
        public void start(Stage primaryStage) {
            // Create an instance of the MorseCodeTranslatorUI class
            SinhalaToEnglishTranslatorUI translatorUI = new SinhalaToEnglishTranslatorUI();

            // Create a Scene and set the root node
            Scene scene = new Scene(translatorUI.getRootNode(), 450, 200);

            // Set the Scene and show the Stage
            primaryStage.setScene(scene);
            primaryStage.setTitle("Sinhala To English");
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
