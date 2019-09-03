package com.cy.observer.myObserver.subject;


import com.cy.observer.myObserver.observer.Observer;

public interface Subject {

    /*添加观察者*/
    void addObserver(Observer observer);

    /*删除观察者*/
    void removeObserver(Observer observer);

    /*通知观察值额*/
    void notifyObservers();
}
