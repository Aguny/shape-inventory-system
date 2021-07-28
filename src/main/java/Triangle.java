public class Triangle implements Shape {

    Observable observable;

    public Triangle() {
        observable = new Observable(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
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
