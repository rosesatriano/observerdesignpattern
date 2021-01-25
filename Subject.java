package observerdesignpattern;

/**
 * The interface Subject is used for other classes to 
 * implement. This inlcudes registering, removing, and 
 * notifying the observers.
 * @author rosesatriano
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);
}
