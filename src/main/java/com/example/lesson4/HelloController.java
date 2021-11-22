package com.example.lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    Label mainTitle;

    @FXML
    TextArea mainTextArea;

    @FXML
    TextField mainMessage;


    @FXML
    public void btnOneClickAction(ActionEvent actionEvent) {
        mainTextArea.appendText(mainMessage.getText() + "\n");
        mainMessage.clear();
    }
}


