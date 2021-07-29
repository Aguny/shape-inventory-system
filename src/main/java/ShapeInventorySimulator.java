public class ShapeInventorySimulator {

    public static void main(String[] args) {
        ShapeInventorySimulator simulator = new ShapeInventorySimulator();
        AbstractShapeFactory shapeFactory = new ShapeCountingFactory();
        simulator.simulate(shapeFactory);
    }

    void simulate(AbstractShapeFactory shapeFactory) {

        System.out.println("WELCOME TO THE AWESOME SHAPE PRODUCTION FACILITY!\n");
        System.out.println("Days without incidents: 5");
        System.out.println("Starting up shape production line...\n");


        ShapeMonitor monitor = new ShapeMonitor();

        Shape standAloneTriangle = shapeFactory.createTriangle();
        standAloneTriangle.registerObserver(monitor);
        simulate(standAloneTriangle);

        Shape square = shapeFactory.createSquare();
        Shape rectangle = shapeFactory.createRectangle();
        Shape triangle = shapeFactory.createTriangle();
        Shape circle = new CircleAdapter(new Circle());

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
        boxOfAllShapes.registerObserver(monitor);

        simulate(boxOfAllShapes);

        System.out.println("\nShutting down the production line...");
        System.out.println("TODAY'S RESULTS: " + ShapeCounter.getShapes() + " non-round shapes have been created today");
    }
    
    void simulate(Shape shape) {
        shape.draw();
    }
}
