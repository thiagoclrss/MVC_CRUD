import controller.UserController;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import view.UserView;

public class Main {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      UserView view = new UserView();
      UserController controller = new UserController(view);

      boolean running = true;

      while (running) {
        String[] options = {"Add User", "View User", "Update User", "Delete User", "Exit"};
        int choice = JOptionPane.showOptionDialog(null, "Choose an option", "User Management",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        switch (choice) {
          case 0: // Add User
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter User ID:"));
            String name = JOptionPane.showInputDialog("Enter User Name:");
            String email = JOptionPane.showInputDialog("Enter User Email:");
            String phoneNumber = JOptionPane.showInputDialog("Enter User Phone Number:");
            controller.addUser(id, name, email, phoneNumber);
            break;

          case 1: // View User
            int viewId = Integer.parseInt(JOptionPane.showInputDialog("Enter User ID to view:"));
            controller.getUser(viewId);
            break;

          case 2: // Update User
            int updateId = Integer.parseInt(
                JOptionPane.showInputDialog("Enter User ID to update:"));
            String newName = JOptionPane.showInputDialog("Enter new User Name:");
            String newEmail = JOptionPane.showInputDialog("Enter new User Email:");
            String newPhoneNumber = JOptionPane.showInputDialog("Enter new User Phone Number:");
            controller.updateUser(updateId, newName, newEmail, newPhoneNumber);
            break;

          case 3: // Delete User
            int deleteId = Integer.parseInt(
                JOptionPane.showInputDialog("Enter User ID to delete:"));
            controller.deleteUser(deleteId);
            break;

          case 4: // Exit
            running = false;
            break;

          default:
            JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
        }
      }
    });
  }
}