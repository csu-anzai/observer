package com.cy.observer.myObserver.subject.impl;

import com.cy.observer.myObserver.observer.Observer;
import com.cy.observer.myObserver.subject.Subject;

import java.util.List;
import java.util.Vector;

public class MyPaymentStatusUpdateSubject implements Subject {

    private List<Observer> observers = new Vector<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }

    public void updatePaymentStatus(int newStatus){
        /*业余逻辑操作*/
        System.out.println("更新新的支付状态为：" + newStatus);

        /*通知观察者*/
        this.notifyObservers();
    }
}
