public class ShapeInventorySimulator {

    public static void main(String[] args) {
        ShapeInventorySimulator simulator = new ShapeInventorySimulator();
        AbstractShapeFactory shapeFactory = new ShapeCountingFactory();
        simulator.simulate(shapeFactory);
    }

    void simulate(AbstractShapeFactory shapeFactory) {
        Shape square = shapeFactory.createSquare();
        Shape rectangle = shapeFactory.createRectangle();
        Shape triangle = shapeFactory.createTriangle();
        Shape circle = new CircleAdapter(new Circle());
        System.out.println("\nShape inventory simulator");

        BoxOfShapes boxOfAllShapes = new BoxOfShapes();

        boxOfAllShapes.addShapeToBox(square);
        boxOfAllShapes.addShapeToBox(rectangle);
        boxOfAllShapes.addShapeToBox(triangle);
        boxOfAllShapes.addShapeToBox(circle);

        BoxOfShapes boxOfSquares = new BoxOfShapes();

        Shape square2 = shapeFactory.createSquare();
        Shape square3 = shapeFactory.createSquare();
        Shape square4 = shapeFactory.createSquare();
        Shape square5 = shapeFactory.createSquare();

        boxOfSquares.addShapeToBox(square2);
        boxOfSquares.addShapeToBox(square3);
        boxOfSquares.addShapeToBox(square4);
        boxOfSquares.addShapeToBox(square5);

        boxOfAllShapes.addShapeToBox(boxOfSquares);

        ShapeMonitor monitor = new ShapeMonitor();
        boxOfAllShapes.registerObserver(monitor);

        simulate(boxOfAllShapes);

        System.out.println(ShapeCounter.getShapes() + " shapes have been created in total");
    } 
    
    void simulate(Shape shape) {
        shape.draw();
    }
}
