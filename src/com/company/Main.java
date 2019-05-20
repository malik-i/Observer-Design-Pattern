package com.company;

public class Main {

    public static void main(String[] args) {
	    StockGrabber stockGrabber = new StockGrabber();

	    StockObserver observer1 = new StockObserver(stockGrabber);

	    stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(240.44);
        stockGrabber.setGoogPrice(444.44);
    }
}
