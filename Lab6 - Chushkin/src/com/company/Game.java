package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private final String rules = "<html>Угадайте число в диапазоне от 0 до 20. У вас будет три попытки,<br/>прежде чем игра завершится</html>";
    private int countTry = 0;
    private int randNum;
    private JButton button;
    private JTextField textField;
    private JLabel label;

    public Game() {
        super("Игра-угадайка");
        addInputElement();
        randNum = (int) (Math.random() * 100 % 20);
        System.out.print(randNum);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().isEmpty()) return;
                int num = -1;
                try {
                    num = Integer.parseInt(textField.getText());
                }catch (NumberFormatException e1){
                    e1.printStackTrace();
                    return;
                }
                if (countTry < 3 && num != randNum) {
                    countTry++;
                    String fCollocation = "Вы не угадали. Попробуйте снова.\n";
                    String flag = randNum < num ? fCollocation + "Заднное число меньше введённого." : fCollocation + "Заднное число больше введённого.";
                    flag = countTry == 3 ? "Вы проиграли." : flag;
                    textField.setText("");
                    if (countTry == 3) dispose();
                    JOptionPane.showMessageDialog(null, flag);
                } else {
                    dispose();
                    JOptionPane.showMessageDialog(null, "Вы выиграли.");
                }
            }
        });

        setSize(800, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void addInputElement() {
        button = new JButton("Обработать");
        textField = new JTextField();
        label = new JLabel(rules, SwingConstants.CENTER);

        label.setBounds(200, 50, 400, 200);
        label.setFont(new Font("Times new Roman", Font.ITALIC, 22));
        textField.setBounds(300, 250, 200, 50);
        button.setFont(new Font("Arial", Font.BOLD, 22));
        button.setBounds(250, 350, 300, 100);

        add(label);
        add(textField);
        add(button);
    }
}
