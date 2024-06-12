package lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create the text field
        JTextField textField = new JTextField(20);

        // Create the button
        JButton button = new JButton("Click Me");

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display the message dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "You clicked the button");
            }
        });

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
