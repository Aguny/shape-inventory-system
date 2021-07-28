public class ShapeFactory extends AbstractShapeFactory {

    @Override
    public Shape createSquare() {
        return new Square();
    }

    @Override
    public Shape createRectangle() {
        return new Rectangle();
    }

    @Override
    public Shape createTriangle() {
        return new Triangle();
    }

}
