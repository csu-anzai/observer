package com.cy.observer.jdkObserver.observer;

import java.util.Observable;
import java.util.Observer;

public class JdkEmailObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("邮件服务收到通知");
    }
}
