package observerdesignpattern;

import java.util.ArrayList;
/**
 * The class Golfer implements the interface Subject.
 * This class includes methods that name the golfer,
 * registering the observers, getting the name, entering
 * the score, notifying the observers, and removing observers.
 * @author rosesatriano
 */
public class Golfer implements Subject{
    String name = "";
    ArrayList<Observer> observers;

    /**
     * In the method Golfer, the name is initialized for the golfer.
     * The observers get a new array list addressed to it.
     * @param name This is the string for the golfer's name.
     */
    public Golfer(String name){
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * registerObserver is a method that adds an observer to the
     * observers array list.
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * This string method gets the name.
     * @return This returns the name.
     */
    public String getName(){
        return name;
    }

    /**
     * The method enterScore enters the score in, so it can 
     * be notified to the observers.
     * @param strokes Number of strokes the golfer takes.
     * @param par Number of strokes set for that hole.
     */
    public void enterScore(int strokes, int par){
        notifyObservers(strokes, par);
    }

    /**
     * The method notifyObservers notifies each observer in the array 
     * list. This is done by updating the strokes and par.
     * @param strokes Number of strokes the golfer takes.
     * @param par Number of strokes set for that hole.
     */
    public void notifyObservers(int strokes, int par){
        for(Observer observer: observers){
            observer.update(strokes, par);
        }
    }

    /**
     * The method removerObserver takes an observer off of the 
     * observers array list.
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
}
