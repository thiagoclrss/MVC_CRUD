package model;

import java.util.Observable;

public class User extends Observable {

  private int id;
  private String name;
  private String email;
  private String phoneNumber;

  public User(int id, String name, String email, String phoneNumber) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    setChanged();
    notifyObservers();
  }
}