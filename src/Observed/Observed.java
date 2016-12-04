package Observed;
import Observer.Observer;

/**
 * Created by Андрей on 04.12.2016.
 */
public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
