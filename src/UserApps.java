import Observed.MeteoStation;
import Observer.User;

/**
 * Created by Андрей on 04.12.2016.
 */
public class UserApps {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new User());
        station.setMeasurements(25, 760);
    }
}
