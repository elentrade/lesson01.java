import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyWindow extends JFrame {

        MyWindow(){
            setSize(600,600);
            setLocation(500,500);

            setDefaultCloseOperation(EXIT_ON_CLOSE );
            JPanel panel1 = new JPanel(new GridLayout(1,2));
            JPanel panel2 = new JPanel(new GridLayout(1,2));
            JButton button1 = new JButton("Button 1");
            JButton button2 = new JButton("Button 2");
            JTextField txt = new JTextField();
            JCheckBox box = new JCheckBox();
            panel1.add(button1);
            panel1.add(button2);
            panel2.add(box);
            panel2.add(txt);
            add(panel1,BorderLayout.SOUTH);
            add(panel2,BorderLayout.NORTH);
            ActionListener listener1 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    System.exit(0);
                }
            };
            button1.addActionListener(listener1);
            ActionListener listener2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt.setBackground(Color.blue);
                    txt.setText("GAME OVER");
                    repaint();
                }
            };
            button2.addActionListener(listener2);




            txt.setSize(150,150);
            box.setSize(50,50);
            button1.setSize(150,50);
            button2.setSize(150,50);
            setVisible(true);

        }


    }

