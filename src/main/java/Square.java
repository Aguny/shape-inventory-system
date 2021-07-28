public class Square implements Shape{

    Observable observable;

    public Square() {
        observable = new Observable(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
