package com.cy.observer.beanObserver.subject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PaymentStatusUpdateBean {

     PropertyChangeSupport paymentListeners = new PropertyChangeSupport(this);

     public void updateStatus(int newStatus){
         /*模拟业务逻辑*/
         System.out.println("支付状态更新" + newStatus);

         /*触发通知*/
         paymentListeners.firePropertyChange("paymentStatuUpdate", 0, newStatus);
     }

     public void addPropertyChangeListener(PropertyChangeListener listener){
         paymentListeners.addPropertyChangeListener(listener);
     }

     public void removePropertyChangeListener(PropertyChangeListener listener){
         paymentListeners.removePropertyChangeListener(listener);
     }
}
