package observerdesignpattern;

/**
 * Observer is an interface that the other classes 
 * implement. This includes the  update of the number 
 * of strokes and the par.
 * @author rosesatriano 
 */
public interface Observer {
    public void update(int strokes, int par);
}
