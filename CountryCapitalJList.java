/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
countries on console whenever the countries are selected on the list.
*/
package six;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CountryCapitalJList extends JFrame {

    public CountryCapitalJList() {

        // List Model
        DefaultListModel<String> model = new DefaultListModel<>();

        model.addElement("USA");
        model.addElement("India");
        model.addElement("Vietnam");
        model.addElement("Canada");
        model.addElement("Denmark");
        model.addElement("France");
        model.addElement("Great Britain");
        model.addElement("Japan");
        model.addElement("Africa");
        model.addElement("Greenland");
        model.addElement("Singapore");

        // JList
        JList<String> countryList = new JList<>(model);

        // Map for capitals
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Event Listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    String capital = capitals.get(selectedCountry);

                    if (capital != null) {
                        System.out.println("Capital of " + selectedCountry + " is: " + capital);
                    }
                }
            }
        });

        // Add to Frame
        add(new JScrollPane(countryList));

        setTitle("Country Capitals");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalJList();
    }
}