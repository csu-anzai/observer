package com.cy.observer.jdkObserver.observer;

import java.util.Observable;
import java.util.Observer;

public class JdkStockObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("库存服务收到通知");
    }
}
