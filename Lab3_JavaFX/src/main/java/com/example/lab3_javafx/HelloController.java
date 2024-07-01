package com.example.lab3_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private TextArea txtOut;

    @FXML
    private Button btn;

    @FXML
    void onBtnClick(ActionEvent event) {
        txtOut.setText("My console is here now.");
    }
}