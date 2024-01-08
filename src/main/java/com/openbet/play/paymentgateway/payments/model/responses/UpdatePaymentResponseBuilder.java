package com.openbet.play.paymentgateway.payments.model.responses;

import com.openbet.play.paymentgateway.payments.model.Payment;

public final class UpdatePaymentResponseBuilder {
    protected boolean success;
    protected String transactionId;
    protected String message;
    protected String providerResponse;
    protected Payment payment;

    private UpdatePaymentResponseBuilder() {
    }

    public static UpdatePaymentResponseBuilder anUpdatePaymentResponse() {
        return new UpdatePaymentResponseBuilder();
    }

    public UpdatePaymentResponseBuilder setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public UpdatePaymentResponseBuilder setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public UpdatePaymentResponseBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public UpdatePaymentResponseBuilder setProviderResponse(String providerResponse) {
        this.providerResponse = providerResponse;
        return this;
    }

    public UpdatePaymentResponseBuilder setPayment(Payment payment) {
        this.payment = payment;
        return this;
    }

    public UpdatePaymentResponse build() {
        UpdatePaymentResponse updatePaymentResponse = new UpdatePaymentResponse();
        updatePaymentResponse.setSuccess(success);
        updatePaymentResponse.setTransactionId(transactionId);
        updatePaymentResponse.setMessage(message);
        updatePaymentResponse.setProviderResponse(providerResponse);
        updatePaymentResponse.setPayment(payment);
        return updatePaymentResponse;
    }
}
