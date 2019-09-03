package com.cy.observer.springObserver.subject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentInfo {

    private int id;

    private String status;
}
