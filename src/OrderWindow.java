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
        JComboBox selectedOrder = (JComboBox) e.getSource();
        if (selectedOrder.getSelectedIndex() == 1) {
            System.out.println ("1 muthafukar");
        }

    }
}
