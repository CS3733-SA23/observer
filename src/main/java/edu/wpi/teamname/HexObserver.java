package edu.wpi.teamname;

import javafx.scene.control.Label;

public class HexObserver extends Observer {
  Subject subject;
  Label label;

  public HexObserver(Subject subject, Label label) {
    this.subject = subject;
    this.label = label;
  }

  @Override
  public void update() {}
}
