package com.example.lab5_javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SchoolListApp extends Application {

    private ListView<String> schoolList;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Initialise the ListView and Buttons
        schoolList = new ListView<>();
        Button importButton = new Button("Import");
        Button clearButton = new Button("Clear");

        // Set up the layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(schoolList, importButton, clearButton);

        importButton.setOnAction(event -> importSchools());
        clearButton.setOnAction(event -> schoolList.getItems().clear());

        // Set up scene and stage
        Scene scene = new Scene(layout, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("School List Application");
        primaryStage.show();
    }

    private void importSchools() {
        File file = new File("schools_list.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String school = scanner.nextLine();
                schoolList.getItems().add(school);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

    }
}