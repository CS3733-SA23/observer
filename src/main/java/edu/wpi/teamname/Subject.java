package edu.wpi.teamname;

import java.util.ArrayList;
import java.util.List;

public class Subject {
  private List<Observer> observers = new ArrayList<Observer>();
  private int state;

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public void notifyAllObservers() {}

  public void attach(Observer observer) {}
}
