package com.company;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private ArrayList<Observer> observers;

    public StockGrabber(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unRegister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);

    }

    @Override
    public void notifyObserver(Observer o) {

    }
}
