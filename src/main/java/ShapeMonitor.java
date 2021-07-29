public class ShapeMonitor implements Observer {

    public void update (ShapeObservable shape) {
        if (shape.getClass().getName().equals("CircleAdapter")) {
            System.out.println("Assembly line monitor: a new circle has been produced") ;
        } else {
            System.out.println("Assembly line monitor: a new " + shape.getClass().getName().toLowerCase() + " has been produced") ;
        }

    }
}
