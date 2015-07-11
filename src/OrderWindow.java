import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kyle on 05/07/2015.
 */
public class OrderWindow implements ActionListener {

    BikeOrder parent;

    public OrderWindow(BikeOrder bikeOrder) {
        this.parent = bikeOrder;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        JComboBox selectedBike = (JComboBox) e.getSource();
        int orderQuantity = parent.getOrderQuantity();
        try {
            parent.validateOrder(selectedBike.getSelectedItem().toString(), orderQuantity);
        } catch (TooManyBikesException e1) {
            e1.printStackTrace();
        }

    }
}
