import java.util.EventListener;

/**
 * Created by Kyle on 05/07/2015.
 */
public class BikeOrder implements EventListener {
    public static void validateOrder (String bikeModel,
                                      int quantity) throws TooManyBikesException {
//        perform some data validation, and if the entered
//        the quantity or model is invalid, do the following:
        throw new TooManyBikesException("Cannot ship" + quantity
                + "bikes of the model" + bikeModel);
    }

}

