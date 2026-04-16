//78. Develop a java GUI Program to calculate the factorial of a number.

import javax.swing.*;

public class q78 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Factorial Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numberField = new JTextField(20);
        JButton submitButton = new JButton("Calculate");
        JTextArea answerArea = new JTextArea(1, 20);

        JPanel panel = new JPanel();
        panel.add(numberField);
        panel.add(submitButton);
        panel.add(answerArea);

        submitButton.addActionListener(e -> {
            int num = Integer.parseInt(numberField.getText());
            double factorial=1;
            for(int i=1; i<=num; i++) {
                factorial*=i;
            }
            answerArea.setText("Factorial= "+factorial);
        });

        frame.add(panel);
        frame.setSize(600,200);
        frame.setVisible(true);
    }
}
