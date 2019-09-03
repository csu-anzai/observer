package com.cy.observer.springObserver.service;

import com.cy.observer.springObserver.event.PaymentStatusUpdateEvent;
import com.cy.observer.springObserver.subject.PaymentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    ApplicationContext applicationContext;

    public void pay(int id, String newStatus){

        PaymentStatusUpdateEvent event = new PaymentStatusUpdateEvent(new PaymentInfo(id, newStatus));

        applicationContext.publishEvent(event);
    }
}
