package Observed;
import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 04.12.2016.
 */
public class MeteoStation implements Observed {

    List<Observer> observers = new ArrayList<>();

    int temperature;
    int pressure;

    public void setMeasurements(int t, int p){
        this.temperature = t;
        this.pressure = p;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.heandleEvent(temperature, pressure);
        }
    }
}
