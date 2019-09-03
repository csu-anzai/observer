package com.cy.observer.jdkObserver.subject;

import java.util.Observable;

public class JdkPaymentStatusObservable extends Observable {

    public void updatePaymentStatus(int newStatus){
        /*业务逻辑操作*/
        System.out.println("更新支付状态为：" + newStatus);

        /*通知观察者*/
        this.setChanged();
        this.notifyObservers();
    }
}
