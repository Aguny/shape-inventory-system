public class ShapeCountingFactory extends AbstractShapeFactory{

    @Override
    public Shape createSquare() {
        return new ShapeCounter(new Square());
    }

    @Override
    public Shape createRectangle() {
        return new ShapeCounter(new Rectangle());
    }

    @Override
    public Shape createTriangle() {
        return new ShapeCounter(new Triangle());
    }

}
