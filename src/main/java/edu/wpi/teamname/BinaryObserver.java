package edu.wpi.teamname;

import javafx.scene.control.Label;

public class BinaryObserver extends Observer {
  public BinaryObserver(Subject subject, Label label) {
    this.subject = subject;
    this.label = label;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    label.setText("Binary: " + Integer.toBinaryString(subject.getState()));
  }
}
