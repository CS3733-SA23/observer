package edu.wpi.teamname;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

  @FXML Label hex, octal, binary;

  @FXML TextField number;

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    Subject subject = new Subject();

    // TODO Create your observers that attach to the subject

    // TODO Need to set the subject state based on what is input in the text field
    number
        .textProperty()
        .addListener(
            observable -> {
              subject.setState(0);
            });
  }
}
