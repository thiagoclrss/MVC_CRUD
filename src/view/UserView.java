package view;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import model.User;

public class UserView extends JFrame implements Observer {

  private JLabel userIdLabel;
  private JLabel userNameLabel;
  private JLabel userEmailLabel;
  private JLabel userPhoneNumberLabel;

  public UserView() {
    setTitle("User Information");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3, 1));

    userIdLabel = new JLabel("ID: ");
    userNameLabel = new JLabel("Name: ");
    userEmailLabel = new JLabel("Email: ");
    userPhoneNumberLabel = new JLabel("Phone Number: ");

    add(userIdLabel);
    add(userNameLabel);
    add(userEmailLabel);
    add(userPhoneNumberLabel);

    setVisible(true);
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof User) {
      User user = (User) o;
      displayUserDetails(user);
    }
  }

  public void displayUserDetails(User user) {
    SwingUtilities.invokeLater(() -> {
      userIdLabel.setText("ID: " + user.getId());
      userNameLabel.setText("Name: " + user.getName());
      userEmailLabel.setText("Email: " + user.getEmail());
      userPhoneNumberLabel.setText("Phone Number: " + user.getPhoneNumber());

      revalidate();
      repaint();
    });
  }
}