// 76. Develop a student registration form using Swing with fields for Name, Age, Email,
// and Course. The details must be stored in the MySQL Database. Display the
// entered details in the terminal when the user submits and show a submitted
// successfully pop-up.

import java.sql.*;
import javax.swing.*;

public class q76 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_registration";
        String user = "root";
        String pass = "root123*";

        JFrame frame = new JFrame("Student Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JTextField nameField = new JTextField(20);
        JTextField ageField = new JTextField(20);
        JTextField emailField = new JTextField(20);
        JTextField courseField = new JTextField(20);
        panel.add(nameField);
        panel.add(ageField);
        panel.add(emailField);
        panel.add(courseField);

        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String email = emailField.getText();
            String course = courseField.getText();

            try {
                Connection con = DriverManager.getConnection(url,user,pass);
                Statement st = con.createStatement();
                String sql = "INSERT INTO students (name, age, email, course) VALUES ('"+name+"', "+age+", '"+email+"', '"+course+"')";
                
                st.executeUpdate(sql);
                System.out.println("Details submitted successfully");
                con.close();
            } catch (SQLException err) {
                err.printStackTrace();    
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Email: " + email);
            System.out.println("Course: " + course);
            JOptionPane.showMessageDialog(frame, "Details submitted successfully");
        });


        frame.add(panel);
        frame.setSize(400, 600);
        frame.setVisible(true);
    }
}
