import javax.swing.*;
import java.util.EventListener;

/**
 * Created by Kyle on 05/07/2015.
 */
public class BikeOrder implements EventListener {

    private JPanel windowContent;
    private JComboBox bikeList;

    public BikeOrder() {
        String[] bikeModel = {"Bike 1", "Bike 2", "Bike 3"};

        windowContent = new JPanel();
        bikeList = new JComboBox(bikeModel);
        bikeList.setSelectedIndex(0);

        windowContent.add(bikeList);


        JFrame frame = new JFrame();

        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void validateOrder(String bikeModel,
                                     int quantity) throws TooManyBikesException {
//        perform some data validation, and if the entered
//        the quantity or model is invalid, do the following:
//        throw new TooManyBikesException("Cannot ship" + quantity
//                + "bikes of the model" + bikeModel);
    }

    public static void main(String[] args) {
        BikeOrder bikeOrder = new BikeOrder();
    }

}

