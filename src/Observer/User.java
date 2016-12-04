package Observer;

/**
 * Created by Андрей on 04.12.2016.
 */
public class User implements Observer {

    @Override
    public void heandleEvent(int temp, int press) {
        System.out.println("We have some changes. Temperature is: " + temp + " Pressure is: " + press);

    }
}
