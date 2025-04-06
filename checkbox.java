import javax.swing.*;

public class CheckBoxExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("CheckBox Example");

        // Create a CheckBox
        JCheckBox checkBox = new JCheckBox("I agree to the terms and conditions");
        checkBox.setBounds(100, 50, 300, 50);

        // Add the CheckBox to the JFrame
        frame.add(checkBox);

        // Set JFrame properties
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}