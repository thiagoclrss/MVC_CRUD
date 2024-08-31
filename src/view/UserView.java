package view;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import model.User;

public class UserView extends JFrame implements Observer {
  private JLabel userIdLabel;
  private JLabel userNameLabel;
  private JLabel userEmailLabel;

  public UserView() {
    // Setting up the JFrame
    setTitle("User Information");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3, 1));

    // Initialize labels
    userIdLabel = new JLabel("ID: ");
    userNameLabel = new JLabel("Name: ");
    userEmailLabel = new JLabel("Email: ");

    // Add labels to the JFrame
    add(userIdLabel);
    add(userNameLabel);
    add(userEmailLabel);

    setVisible(true);
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof User) {
      User user = (User) o;
      SwingUtilities.invokeLater(() -> {
        userIdLabel.setText("ID: " + user.getId());
        userNameLabel.setText("Name: " + user.getName());
        userEmailLabel.setText("Email: " + user.getEmail());

        // Force the layout to update and repaint the frame
        revalidate();
        repaint();
      });
    }
  }

  public void displayUserDetails(User user) {
    SwingUtilities.invokeLater(() -> {
      userIdLabel.setText("ID: " + user.getId());
      userNameLabel.setText("Name: " + user.getName());
      userEmailLabel.setText("Email: " + user.getEmail());

      // Force the layout to update and repaint the frame
      revalidate();
      repaint();
    });
  }
}