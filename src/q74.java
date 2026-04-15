//74. Develop a Java program using Swing to create a frame and a text box.

import javax.swing.*;

public class q74 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(new JTextField(20));
        
        frame.add(panel);
        frame.setSize(400, 600);
        frame.setVisible(true);
    }
}
