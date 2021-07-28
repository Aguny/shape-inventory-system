public interface ShapeObservable {

    public void registerObserver(Observer observer);
    public void notifyObservers();
}
