package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class User extends Observable {
  private int id;
  private String name;
  private String email;

  public User(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  // Getters and Setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
    setChanged();
    notifyObservers();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    setChanged();
    notifyObservers();
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
    setChanged();
    notifyObservers();
  }
}