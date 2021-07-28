import java.util.ArrayList;
import java.util.Iterator;


public class Observable implements ShapeObservable{

    ArrayList observers = new ArrayList();
    ShapeObservable shape;

    public Observable(ShapeObservable shape) {
        this.shape = shape;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();

        while (iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            observer.update(shape);
        }
    }
}
