package observerdesignpattern;

import java.util.ArrayList;

public class Golfer implements Subject{
    String name = "";
    ArrayList<Observer> observers;

    public Golfer(String name){
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public String getName(){
        return name;
    }

    public void enterScore(int strokes, int par){
        notifyObservers(strokes, par);
    }

    public void notifyObservers(int strokes, int par){
        for(Observer observer: observers){
            observer.update(strokes, par);
        }
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
}
