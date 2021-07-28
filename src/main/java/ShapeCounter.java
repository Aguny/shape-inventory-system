public class ShapeCounter implements Shape {

    Shape shape;
    static int numberOfShapes;

    public ShapeCounter (Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
        numberOfShapes++;
    }

    @Override
    public void registerObserver(Observer observer) {
        shape.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        shape.notifyObservers();
    }

    public static int getShapes() {
        return numberOfShapes;
    }
}
