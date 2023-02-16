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

    new HexObserver(subject, hex);
    new BinaryObserver(subject, binary);
    new OctalObserver(subject, octal);

    number
        .textProperty()
        .addListener(
            observable -> {
              String text = number.getText();

              int parsed_integer = 0;
              try {
                parsed_integer = Integer.parseInt(text);
              } catch (NumberFormatException ignored) {
              }

              subject.setState(parsed_integer);
            });
  }
}
