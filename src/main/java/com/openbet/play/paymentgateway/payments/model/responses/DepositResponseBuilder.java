package com.openbet.play.paymentgateway.payments.model.responses;

import com.openbet.play.paymentgateway.payments.model.Payment;

public final class DepositResponseBuilder {
    protected boolean success;
    protected String transactionId;
    protected String message;
    protected String providerResponse;
    protected Payment payment;

    private DepositResponseBuilder() {
    }

    public static DepositResponseBuilder aDepositResponse() {
        return new DepositResponseBuilder();
    }

    public DepositResponseBuilder setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public DepositResponseBuilder setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public DepositResponseBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public DepositResponseBuilder setProviderResponse(String providerResponse) {
        this.providerResponse = providerResponse;
        return this;
    }

    public DepositResponseBuilder setPayment(Payment payment) {
        this.payment = payment;
        return this;
    }

    public DepositResponse build() {
        DepositResponse depositResponse = new DepositResponse();
        depositResponse.setSuccess(success);
        depositResponse.setTransactionId(transactionId);
        depositResponse.setMessage(message);
        depositResponse.setProviderResponse(providerResponse);
        depositResponse.setPayment(payment);
        return depositResponse;
    }
}
