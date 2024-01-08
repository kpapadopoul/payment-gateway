package com.openbet.play.paymentgateway.payments.model.responses;

import com.openbet.play.paymentgateway.payments.model.Payment;

public final class CompletePaymentResponseBuilder {
    protected boolean success;
    protected String transactionId;
    protected String message;
    protected String providerResponse;
    protected Payment payment;

    private CompletePaymentResponseBuilder() {
    }

    public static CompletePaymentResponseBuilder aCompletePaymentResponse() {
        return new CompletePaymentResponseBuilder();
    }

    public CompletePaymentResponseBuilder setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public CompletePaymentResponseBuilder setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public CompletePaymentResponseBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public CompletePaymentResponseBuilder setProviderResponse(String providerResponse) {
        this.providerResponse = providerResponse;
        return this;
    }

    public CompletePaymentResponseBuilder setPayment(Payment payment) {
        this.payment = payment;
        return this;
    }

    public CompletePaymentResponse build() {
        CompletePaymentResponse completePaymentResponse = new CompletePaymentResponse();
        completePaymentResponse.setSuccess(success);
        completePaymentResponse.setTransactionId(transactionId);
        completePaymentResponse.setMessage(message);
        completePaymentResponse.setProviderResponse(providerResponse);
        completePaymentResponse.setPayment(payment);
        return completePaymentResponse;
    }
}
