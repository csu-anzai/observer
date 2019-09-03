package com.cy.observer.myObserver.observer.impl;

import com.cy.observer.myObserver.observer.Observer;

public class MyStockObserver implements Observer {

    @Override
    public void update() {
        System.out.println("库存服务收到通知");
    }
}
