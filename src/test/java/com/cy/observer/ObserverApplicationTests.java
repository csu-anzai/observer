package com.cy.observer;

import com.cy.observer.beanObserver.observer.PaymentStatusUpdateListener;
import com.cy.observer.beanObserver.subject.PaymentStatusUpdateBean;
import com.cy.observer.jdkObserver.observer.JdkEmailObserver;
import com.cy.observer.jdkObserver.observer.JdkStockObserver;
import com.cy.observer.jdkObserver.subject.JdkPaymentStatusObservable;
import com.cy.observer.myObserver.observer.impl.MyEmailObserver;
import com.cy.observer.myObserver.observer.impl.MyStockObserver;
import com.cy.observer.myObserver.subject.impl.MyPaymentStatusUpdateSubject;
import com.cy.observer.springObserver.service.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObserverApplicationTests {

    @Test
    /*支付状态更新-》可以看作一个事件，可以被监听的事件*/
    public void testMyObserver() {
        /*被观察者，即事件源*/
        MyPaymentStatusUpdateSubject paymentStatusUpdateSubject = new MyPaymentStatusUpdateSubject();

        /*观察者，即事件监听器*/
        MyEmailObserver emailObserver = new MyEmailObserver();
        MyStockObserver stockObserver = new MyStockObserver();

        /*添加观察者*/
        paymentStatusUpdateSubject.addObserver(emailObserver);
        paymentStatusUpdateSubject.addObserver(stockObserver);

        /*发布事件，支付状态更新*/
        paymentStatusUpdateSubject.updatePaymentStatus(2);
    }

    @Test
    public void testJdkObserver(){
        JdkPaymentStatusObservable paymentStatusObservable = new JdkPaymentStatusObservable();

        JdkEmailObserver emailObserver = new JdkEmailObserver();
        JdkStockObserver stockObserver = new JdkStockObserver();

        paymentStatusObservable.updatePaymentStatus(2);
    }

    @Test
    public void testBeanObserver(){
        PaymentStatusUpdateBean paymentStatusUpdateBean = new PaymentStatusUpdateBean();

        paymentStatusUpdateBean.addPropertyChangeListener(new PaymentStatusUpdateListener());

        paymentStatusUpdateBean.updateStatus(3);
    }


    @Autowired
    PaymentService paymentService;

    @Test
    public void testSpringObserver(){

        paymentService.pay(1,"支付成功");
    }
}
