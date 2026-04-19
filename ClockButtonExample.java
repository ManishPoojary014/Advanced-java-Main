/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
implementing the event handling mechanism with addActionListener( ).
*/
package fifth;
import javax.swing.*;
import java.awt.event.*;

public class ClockButtonExample {

    ClockButtonExample() {

        JFrame f = new JFrame("Clock Button Example");

        JLabel label = new JLabel();
        label.setBounds(50, 50, 400, 50);

        // Load images (make sure images are in project folder)
        ImageIcon digitalIcon = new ImageIcon(getClass().getResource("digitalclock.jpg"));
        ImageIcon hourglassIcon = new ImageIcon(getClass().getResource("hourglass.jpg"));

        JButton b1 = new JButton("Digital Clock", digitalIcon);
        JButton b2 = new JButton("Hour Glass", hourglassIcon);

        b1.setBounds(50, 120, 200, 80);
        b2.setBounds(270, 120, 200, 80);

        // Action for Digital Clock button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Action for Hour Glass button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        f.add(b1);
        f.add(b2);
        f.add(label);

        f.setSize(550, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ClockButtonExample();
    }
}