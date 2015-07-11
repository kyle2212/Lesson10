import javax.swing.*;
import java.awt.*;
import java.util.EventListener;

/**
 * Created by Kyle on 05/07/2015.
 */
public class BikeOrder implements EventListener {

    private JPanel windowContent;
    private JComboBox bikeList;
    private JTextField orderQuantity;
    private JLabel bikeLabel;
    private JLabel quantityLabel;


    public BikeOrder() {
        String[] bikeModel = {"Bike 1", "Bike 2", "Bike 3"};



        bikeList = new JComboBox(bikeModel);
        bikeList.setSelectedIndex(0);

        orderQuantity = new JTextField();
        orderQuantity.setPreferredSize(new Dimension(100,25));

        bikeLabel = new JLabel("Bike Category");
        quantityLabel = new JLabel("Quantity");

        windowContent = new JPanel();
        windowContent.add(bikeLabel);
        windowContent.add(bikeList);
        windowContent.add(quantityLabel);
        windowContent.add(orderQuantity);


        JFrame frame = new JFrame();

        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        OrderWindow orderWindow = new OrderWindow(this);
        bikeList.addActionListener(orderWindow);
        orderQuantity.addActionListener(orderWindow);

    }

    public static void validateOrder(String bikeModel,
                                     int quantity) throws TooManyBikesException {
//        perform some data validation, and if the entered
//        the quantity or model is invalid, do the following:
        if (quantity < 1){
            throw new TooManyBikesException("At least one bike needs to be ordered");
        } else {
            if (bikeModel == "Bike 1") {
                throw new TooManyBikesException("Bike 1 is sold out");
            }
        }
        throw new TooManyBikesException("Cannot ship" + quantity
                + "bikes of the model" + bikeModel);
    }

    public int getOrderQuantity() {
        return Integer.parseInt(String.valueOf(orderQuantity.getText()));
    }

    public static void main(String[] args) {
        BikeOrder bikeOrder = new BikeOrder();
    }

}

