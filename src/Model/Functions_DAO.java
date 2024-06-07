package Model;

import java.util.ArrayList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Functions_DAO {
    // ArrayList of users
    public static ArrayList<User> users = new ArrayList<>();

    public static String validateUser(JTextField email_txt, JPasswordField password_txt) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools | Templates.
    }

    // Inner class User
    public static class User {
        private String name;
        private String password;
        private String email;

        public User(String name, String password, String email) {
            this.name = name;
            this.password = password;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }
    }

    // Method to add a user to the ArrayList
    public static void storeUser(String name, String password, String email) {
        if (name.isEmpty() || password.isEmpty() || email.isEmpty()) {
            System.out.println("Please fill in all fields.");
            return;
        }

        users.add(new User(name, password, email));
    }

    public static String validateUser(String emailInput, String passwordInput) {
        String emailWrite = View.menuInicial_GUI.email_txt.getText();
        String passwordWrite = View.menuInicial_GUI.password_txt.getText();
        
        for (User user : users) {
            if (user.getEmail().equals(emailWrite) && user.getPassword().equals(passwordWrite)) {
                return user.getName();
            }
        }

        return null; // Returns null if the user is not found
    }

    public static void showUsers() {
        users.forEach(user -> System.out.println("Name: " + user.getName() + ", Email: " + user.getEmail()));
    }
}
