package visual;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;

public class MainForm {
    JFrame mainFrame;

    public MainForm() {
        mainFrame = new JFrame("Calculate");
        mainFrame.setSize(600, 400);
        mainFrame.setLayout(new FlowLayout());


        JPanel numberPanel = new JPanel(new FlowLayout());
        JPanel textPanel = new JPanel(new FlowLayout());
        JPanel operationPanel = new JPanel(new FlowLayout());

        numberPanel.setSize(300, 200);
        for (int i = 0; i < 9; i++) {
            numberPanel.add(new JButton(String.valueOf(i)));
        }

        JButton minus_btn = new JButton("-");
        JButton plus_btn = new JButton("+");
        JButton multi_btn = new JButton("*");
        JButton div_btn = new JButton("/");
        JButton equals_btn = new JButton("=");

        operationPanel.add(minus_btn);
        operationPanel.add(plus_btn);
        operationPanel.add(multi_btn);
        operationPanel.add(div_btn);
        operationPanel.add(equals_btn);
        operationPanel.setSize(300, 200);

        JTextArea textArea = new JTextArea();
        textArea.setSize(40, 10);
        textPanel.setSize(40, 10);
        textPanel.add(textArea);




        mainFrame.add(numberPanel);
        mainFrame.add(operationPanel);
        mainFrame.add(textPanel);
        mainFrame.setVisible(true);
    }
}
