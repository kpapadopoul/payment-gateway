package com.openbet.play.paymentgateway.payments.model.responses;

import com.openbet.play.paymentgateway.payments.model.Payment;

public final class CancelPaymentResponseBuilder {
    protected boolean success;
    protected String transactionId;
    protected String message;
    protected String providerResponse;
    protected Payment payment;

    private CancelPaymentResponseBuilder() {
    }

    public static CancelPaymentResponseBuilder aCancelPaymentResponse() {
        return new CancelPaymentResponseBuilder();
    }

    public CancelPaymentResponseBuilder setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public CancelPaymentResponseBuilder setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public CancelPaymentResponseBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public CancelPaymentResponseBuilder setProviderResponse(String providerResponse) {
        this.providerResponse = providerResponse;
        return this;
    }

    public CancelPaymentResponseBuilder setPayment(Payment payment) {
        this.payment = payment;
        return this;
    }

    public CancelPaymentResponse build() {
        CancelPaymentResponse cancelPaymentResponse = new CancelPaymentResponse();
        cancelPaymentResponse.setSuccess(success);
        cancelPaymentResponse.setTransactionId(transactionId);
        cancelPaymentResponse.setMessage(message);
        cancelPaymentResponse.setProviderResponse(providerResponse);
        cancelPaymentResponse.setPayment(payment);
        return cancelPaymentResponse;
    }
}
