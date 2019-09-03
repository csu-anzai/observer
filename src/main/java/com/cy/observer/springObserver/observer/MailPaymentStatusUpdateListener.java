package com.cy.observer.springObserver.observer;

import com.cy.observer.springObserver.event.PaymentStatusUpdateEvent;
import com.cy.observer.springObserver.subject.PaymentInfo;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MailPaymentStatusUpdateListener implements SmartApplicationListener {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return eventType == PaymentStatusUpdateEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return sourceType == PaymentInfo.class;
    }

    @Override
    @Async("asyncPromiseExecutor")
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("邮件服务，收到支付状态更新的通知：" + event +
                "-Thread：" + Thread.currentThread().getName());
    }

    @Override
    public int getOrder(){
        return 1;
    }
}
