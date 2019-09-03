package com.cy.observer.springObserver.observer;

import com.cy.observer.springObserver.event.PaymentStatusUpdateEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class StockPaymentStatusUpdateListener implements ApplicationListener<PaymentStatusUpdateEvent> {

    @Override
    @Async("asyncPromiseExecutor")
    public void onApplicationEvent(PaymentStatusUpdateEvent event) {
        System.out.println("库存服务，收到支付状态变更的事件：" + event +
                                "-Thread：" + Thread.currentThread().getName());
    }
}
