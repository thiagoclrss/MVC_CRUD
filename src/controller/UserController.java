package controller;

import java.util.HashMap;
import java.util.Map;
import model.User;
import view.UserView;

public class UserController {

  private Map<Integer, User> userDatabase = new HashMap<>();
  private UserView view;

  public UserController(UserView view) {
    this.view = view;
  }

  // Create User
  public void addUser(int id, String name, String email, String phoneNumber) {
    User user = new User(id, name, email, phoneNumber);
    user.addObserver(view);
    userDatabase.put(id, user);
    view.displayUserDetails(user);
    System.out.println("User added successfully.");
  }

  // Read User
  public void getUser(int id) {
    User user = userDatabase.get(id);
    if (user != null) {
      view.displayUserDetails(user);
    } else {
      System.out.println("User not found.");
    }
  }

  // Update User
  public void updateUser(int id, String name, String email, String phoneNumber) {
    User user = userDatabase.get(id);
    if (user != null) {
      user.setName(name);
      user.setEmail(email);
      user.setPhoneNumber(phoneNumber);
      System.out.println("User updated successfully.");
    } else {
      System.out.println("User not found.");
    }
  }

  // Delete User
  public void deleteUser(int id) {
    if (userDatabase.containsKey(id)) {
      userDatabase.remove(id);
      System.out.println("User deleted successfully.");
    } else {
      System.out.println("User not found.");
    }
  }
}