package com.cy.observer.myObserver.observer.impl;

import com.cy.observer.myObserver.observer.Observer;

public class MyEmailObserver implements Observer {

    @Override
    public void update() {
        System.out.println("邮件服务收到通知");
    }
}
