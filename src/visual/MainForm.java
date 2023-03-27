package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    JFrame mainFrame;
    JTextField textField;

    public MainForm() {
        mainFrame = new JFrame("Calculate");
        mainFrame.setSize(600, 400);
        mainFrame.setLayout(new GridLayout(4,3));


        JPanel numberPanel = new JPanel(new GridLayout(3, 3));
        JPanel textPanel = new JPanel();
        JPanel operationPanel = new JPanel(new GridLayout(0, 3));
        ActionListener testActionListener = new TestActionListener();
        numberPanel.setSize(300, 200);
        for (int i = 0; i < 9; i++) {

            JButton jButton = new JButton(String.valueOf(i));
            jButton.addActionListener(testActionListener);
            numberPanel.add(jButton);
        }

        JButton minus_btn = new JButton("-");
        minus_btn.addActionListener(testActionListener);
        JButton plus_btn = new JButton("+");
        plus_btn.addActionListener(testActionListener);
        JButton multi_btn = new JButton("*");
        multi_btn.addActionListener(testActionListener);
        JButton div_btn = new JButton("/");
        div_btn.addActionListener(testActionListener);
        JButton equals_btn = new JButton("=");
        equals_btn.addActionListener(testActionListener);

        operationPanel.add(minus_btn);
        operationPanel.add(plus_btn);
        operationPanel.add(multi_btn);
        operationPanel.add(div_btn);
        operationPanel.add(equals_btn);
        operationPanel.setSize(300, 200);

        textField = new JTextField("0");
        //textField.setSize();
        textPanel.add(textField);
        textPanel.setSize(40, 10);




        mainFrame.add(textField);
        mainFrame.add(numberPanel);
        mainFrame.add(operationPanel);
        mainFrame.setVisible(true);
    }
    public class TestActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText() + e.getActionCommand());

        }
    }
}
