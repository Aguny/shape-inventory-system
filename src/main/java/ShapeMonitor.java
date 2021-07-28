public class ShapeMonitor implements Observer {

    public void update (ShapeObservable shape) {
        if (shape.getClass().getName().equals("CircleAdapter")) {
            System.out.println("Shape monitor: a new circle has been drawn") ;
        } else {
            System.out.println("Shape monitor: a new " + shape.getClass().getName().toLowerCase() + " has been drawn") ;
        }

    }
}
