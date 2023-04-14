package edu.wpi.teamname;

import javafx.scene.control.Label;

public class BinaryObserver extends Observer {
  Subject subject;
  Label label;

  public BinaryObserver(Subject subject, Label label) {
    this.subject = subject;
    this.label = label;
  }

  @Override
  public void update() {}
}
