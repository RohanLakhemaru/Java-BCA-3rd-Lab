package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {

    private JTextField numField1, numField2, resultField;
    private JButton addButton, subButton, mulButton, divButton;

    public CalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Initialize components
        numField1 = new JTextField(10);
        numField2 = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Result field should not be editable

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        // Add action listeners to buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        // Create panel for input fields
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(numField1);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(numField2);
        inputPanel.add(new JLabel("Result:"));
        inputPanel.add(resultField);

        // Create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);

        // Add panels to frame
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());
        double result = 0;

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subButton) {
            result = num1 - num2;
        } else if (e.getSource() == mulButton) {
            result = num1 * num2;
        } else if (e.getSource() == divButton) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                JOptionPane.showMessageDialog(this, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGUI calculator = new CalculatorGUI();
            calculator.setVisible(true);
        });
    }
}

