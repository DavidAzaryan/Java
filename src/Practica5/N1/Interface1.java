package Practica5.N1;
import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface1 extends JFrame{
    JLabel winner, lastScorer, name1, name2, point1, point2;
    JPanel score = new JPanel();
    public int scoreMilan = 0;
    public int scoreMadrid = 0;
    public int red = 0;
    public int blue = 0;
    //public int count = 0;
    public Interface1(){
        super("Milan x Madrid");
        super.setBounds(750,250,550,300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        super.setResizable(false);

        Font font1 = new Font("Trebuchet MS", Font.BOLD, 26);
        Font font2 = new Font("Trebuchet MS", Font.BOLD, 16);

        Color c1 = new Color(245, 105, 105);
        Color c2 = new Color(175, 55, 160, 80);
        Color c3 = new Color(120, 155, 230);

        JPanel name = new JPanel();
        JPanel info = new JPanel();

        name.setPreferredSize(new Dimension(100, 70));
        score.setPreferredSize(new Dimension(100,100));
        info.setPreferredSize(new Dimension(100,100));
        name.setLayout( new FlowLayout(FlowLayout.CENTER, 40, 20));
        score.setLayout( new FlowLayout(FlowLayout.CENTER, 120,30));
        info.setLayout( new GridLayout(2,2,4,4));

        JButton but1 = new JButton("AC Milan");
        JButton but2 = new JButton("Real Madrid");

        name1 = new JLabel("AC Milan");
        name2 = new JLabel("Real Madrid");
        point1 = new JLabel(String.valueOf(scoreMilan));
        point2 = new JLabel(String.valueOf(scoreMadrid));
        winner = new JLabel("Winner: Draw");
        lastScorer = new JLabel("Last Scorer: N/A");

        name1.setFont(font1);
        name2.setFont(font1);
        point1.setFont(font1);
        point2.setFont(font1);
        lastScorer.setFont(font2);
        winner.setFont(font2);

        info.setBackground(c1);
        name.setBackground(c2);
        but1.setBackground(c3);
        but2.setBackground(c3);
        score.setBackground(new Color(180, 0, 180));
        name1.setForeground(Color.BLUE);
        name2.setForeground(Color.red);
        point1.setForeground(Color.white);
        point2.setForeground(Color.white);

        name.add(name1, BorderLayout.EAST);
        name.add(name2, BorderLayout.WEST);
        score.add(point1, BorderLayout.WEST);
        score.add(point2, BorderLayout.EAST);
        info.add(winner);
        info.add(lastScorer);
        info.add(but1);
        info.add(but2);

        but1.addActionListener(new ButtonMilan());
        but2.addActionListener(new ButtonMadrid());

        super.add(name, BorderLayout.NORTH);
        super.add(score, BorderLayout.CENTER);
        super.add(info, BorderLayout.SOUTH);
    }
    public void win() {
        if (scoreMadrid>scoreMilan){
            winner.setText("Winner: Madrid");
            blue = scoreMilan*(300/(scoreMadrid+scoreMilan));
            red = 255-(scoreMilan*(300/(scoreMadrid+scoreMilan)));
        }
        else if (scoreMadrid<scoreMilan) {
            winner.setText("Winner: Milan");
            blue = 255-(scoreMadrid*(300/(scoreMadrid+scoreMilan)));
            red = scoreMadrid*(300/(scoreMadrid+scoreMilan));
        }
        else {
            winner.setText("Winner: Draw");
            blue = red;
        }
    }
    class ButtonMilan implements ActionListener {
        @Override
        //BLUE
        public void actionPerformed(ActionEvent e) {
            scoreMilan += 1;
            point1.setText(Integer.toString(scoreMilan));
            lastScorer.setText("Last Scorer: Milan");
            win();
            score.setBackground(new Color(red, 0,blue));
        }
    }
    class ButtonMadrid implements ActionListener {
        @Override
        //RED
        public void actionPerformed(ActionEvent e) {
            scoreMadrid+=1;
            point2.setText(Integer.toString(scoreMadrid));
            lastScorer.setText("Last Scorer: Madrid");
            win();
            score.setBackground(new Color(red, 0,blue));
        }
    }

}

