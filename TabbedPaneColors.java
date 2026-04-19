/* 5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
the concerned color whenever the specific tab is selected in the Pan.
*/
package six;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TabbedPaneColors extends JFrame {

    public TabbedPaneColors() {

        // Create TabbedPane
        JTabbedPane tp = new JTabbedPane();

        // Create panels
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        // Set background colors
        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tp.add("Cyan", cyanPanel);
        tp.add("Magenta", magentaPanel);
        tp.add("Yellow", yellowPanel);

        // Add change listener
        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tp.getSelectedIndex();
                String title = tp.getTitleAt(index);
                System.out.println("Selected Color: " + title);
            }
        });

        // Add to frame
        add(tp);

        setTitle("Tabbed Pane Colors");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneColors();
    }
}