package com.openbet.play.paymentgateway.payments.model.parameters;

import com.openbet.play.paymentgateway.payments.model.PaymentStatus;

public class UpdatePaymentParameters {
    private String transactionId;
    private PaymentStatus paymentStatus;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
