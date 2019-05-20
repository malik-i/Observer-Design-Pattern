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
        System.out.println("Observer " + (observerIndex + 1) + " is deleted!");
        observers.remove(observerIndex);


    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(ibmPrice, aaplPrice, googPrice);

        }
    }

    public void setIbmPrice(double _ibmPrice){
        this.ibmPrice = _ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double _aaplPrice){
        this.aaplPrice = _aaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double _googPrice){
        this.googPrice = _googPrice;
        notifyObserver();
    }
}

