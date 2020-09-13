package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchView extends JFrame {
    private JButton madridBtn;
    private JButton milanBtn;

    private JLabel result;
    private JLabel lastScr;

    private Label winLabel;

    private Integer counterMadrid;
    private Integer counterMilan;

    public MatchView() {
        super("Exercise");
        counterMadrid = 0;
        counterMilan = 0;

        madridBtn = new JButton("Real Madrid");
        milanBtn = new JButton("AC Milan");
        result = new JLabel("Result: 0 X 0");
        lastScr = new JLabel("Last Scorer:");
        winLabel = new Label("Winner: N/A");

        setLayout(null);

        add(madridBtn);
        add(milanBtn);
        add(result);
        add(lastScr);
        add(winLabel);

        madridBtn.setBounds(300, 5, 150, 25);
        milanBtn.setBounds(5, 5, 150, 25);
        result.setBounds(190, 50, 150, 25);
        lastScr.setBounds(190, 70, 150, 25);
        winLabel.setBounds(190, 90, 150, 25);

        madridBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterMadrid++;
                printInfo("Real Madrid");
            }
        });

        milanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterMilan++;
                printInfo("AC Milan");
            }
        });


        setSize(470, 250);
        setVisible(true);
    }

    public void printInfo(String name){
        result.setText("Result: "+counterMilan.toString()+" X "+counterMadrid.toString());
        lastScr.setText("Last Scorer: " + name);
        if (counterMilan.equals(counterMadrid))
            winLabel.setText("WINNER: Draw");
        else winLabel.setText(counterMadrid > counterMilan ? "WINNER: Real Madrid" : "WINNER: AC Milan");
    }
}
