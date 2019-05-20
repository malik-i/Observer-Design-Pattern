package com.company;

public class StockObserver implements Observer {
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);
    }


    @Override
    public void update(double _ibmPrice, double _aaplPrice, double _googPrice) {
        this.ibmPrice = _ibmPrice;
        this.aaplPrice = _aaplPrice;
        this.googPrice = _googPrice;

        printPrices();
    }

    public void printPrices(){
        System.out.println(observerID + "\nIBM: " + ibmPrice +
                    "\nAPPL: " + aaplPrice + "\nGGOOG: " + googPrice + "\n");
    }
}
