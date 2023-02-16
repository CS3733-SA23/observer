package edu.wpi.teamname;

import javafx.scene.control.Label;

public abstract class Observer {
  protected Subject subject;
  protected Label label;

  public abstract void update();
}
