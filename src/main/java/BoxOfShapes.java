import java.util.ArrayList;
import java.util.Iterator;

public class BoxOfShapes implements Shape {

    ArrayList boxOfShapes = new ArrayList();

    public void addShapeToBox(Shape shape) {
        boxOfShapes.add(shape);
    }

    @Override
    public void draw() {
        Iterator iterator = boxOfShapes.iterator();
        while (iterator.hasNext()) {
            Shape shape = (Shape)iterator.next();
            shape.draw();
        }
    }

    public void registerObserver(Observer observer) {
        Iterator iterator = boxOfShapes.iterator();
        while (iterator.hasNext()) {
            Shape shape = (Shape) iterator.next();
            shape.registerObserver(observer); }
    }

    public void notifyObservers() { }
}
