public class Rectangle implements Shape{

    Observable observable;

    public Rectangle() {
        observable = new Observable(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
        notifyObservers();
    }
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

}
