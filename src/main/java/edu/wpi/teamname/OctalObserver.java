package edu.wpi.teamname;

import javafx.scene.control.Label;

public class OctalObserver extends Observer {
  Subject subject;
  Label label;

  public OctalObserver(Subject subject, Label label) {
    this.subject = subject;
    this.label = label;
  }

  @Override
  public void update() {}
}
