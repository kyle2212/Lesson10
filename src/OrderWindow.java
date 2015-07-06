import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kyle on 05/07/2015.
 */
public class OrderWindow extends JFrame implements ActionListener {

    JPanel windowsContent;
    JComboBox bikeList;

    public OrderWindow() throws HeadlessException {
        // Create the combo box
        String[] bikeModels = {"Bike 1", "Bike 2", "Bike 3"};

        windowsContent = new JPanel();
        bikeList = new JComboBox(bikeModels);
        bikeList.setSelectedIndex(2);
        windowsContent.add(bikeList);
//        bikeList.addActionListener(BikeOrder);

        JFrame frame = new JFrame("Bike Order");
        frame.setContentPane(windowsContent);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        // the user clicked on the "Validate Order" button

        BikeOrder bikeOrder = new BikeOrder();
        TextComponent txtResult = null;



        try {
            bikeOrder.validateOrder("Model-123", 50);
            // the next line will be skipped in case of exception
            txtResult.setText("Order is valid");
        } catch (TooManyBikesException e1) {
            txtResult.setText(e1.getMessage());
        }
    }

    public static void main(String[] args) {
        OrderWindow orderWindow = new OrderWindow();
    }
}
