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
    notifyAllObservers();
  }

  public void notifyAllObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }
}
