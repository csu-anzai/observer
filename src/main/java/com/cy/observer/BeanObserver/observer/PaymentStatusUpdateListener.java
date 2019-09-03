package com.cy.observer.BeanObserver.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PaymentStatusUpdateListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.printf("支付状态变更. eventName : %s, oldValue : %s, newValue : %s", evt.getPropertyName(), evt.getOldValue(), evt.getNewValue());
    }
}
