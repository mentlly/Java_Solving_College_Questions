//75. Develop a Java program to create a frame and a button named “Submit” in it.

import javax.swing.*;

public class q75 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(new JButton("Submit"));

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
