public class CircleAdapter implements Shape {

    Circle circle;
    Observable observable;

    public CircleAdapter (Circle circle) {
        this.circle = circle;
        observable = new Observable(this);
    }

    public void draw() {
        circle.draw();
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
