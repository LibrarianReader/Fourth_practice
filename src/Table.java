import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Table extends JFrame {
    JButton button_milan;
    JButton button_madrid;
    JLabel result_firstTeam;
    JLabel result_secondTeam;
    JLabel lastScorer;
    JLabel winner;
    JLabel result;
    JButton over_result;

    int count = 0;
    int count2 = 0;

    public Table() {
        super("Football Game");
        setLayout(new FlowLayout()); // последовательное расположение
        button_milan = new JButton("AC Milan");
        button_madrid = new JButton("Real Madrid");
        result_firstTeam = new JLabel("");
        result_secondTeam = new JLabel();
        lastScorer = new JLabel();
        winner = new JLabel();
        result = new JLabel();
        over_result = new JButton("Узнать окончательный результат");

        button_madrid.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                count++;
                result_firstTeam.setText("Забил Real Madrid: " + count);
                lastScorer.setText("Последняя команда, которая забила: Real Madrid");
                result.setText("Result " + count + " X " + count2);

            }
        });

        button_milan.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                count2++;
                result_secondTeam.setText("Забил AC Milan: " + count2);
                lastScorer.setText("Последняя команда, которая забила: AC Milan");
                result.setText("Result " + count + " X " + count2);
            }
        });
        over_result.addActionListener(new ButtonOver());

        add(button_madrid);
        add(button_milan);
        add(result_firstTeam);
        add(result_secondTeam);
        add(lastScorer);
        add(over_result);
    }

    class ButtonOver implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message = "";

            if (count > count2) {
                winner.setText("Победил Real Madrid");

            } else if (count2 > count) {
                winner.setText("Победил AC Milan");
            } else {
                winner.setText("Ничья");
            }
            message += result.getText() + "\n";
            message += winner.getText();
            JOptionPane.showMessageDialog(null, message, "Результат", JOptionPane.PLAIN_MESSAGE);
        }
    }
}