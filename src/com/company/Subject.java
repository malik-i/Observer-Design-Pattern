package com.company;

public interface Subject {
    void register(Observer o);
    void unRegister(Observer o);
    void notifyObserver(Observer o);
}
