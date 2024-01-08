package com.openbet.play.paymentgateway.payments.model.responses;

import com.openbet.play.paymentgateway.payments.model.Payment;

public final class WithdrawResponseBuilder {
    protected boolean success;
    protected String transactionId;
    protected String message;
    protected String providerResponse;
    protected Payment payment;

    private WithdrawResponseBuilder() {
    }

    public static WithdrawResponseBuilder aWithdrawResponse() {
        return new WithdrawResponseBuilder();
    }

    public WithdrawResponseBuilder setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public WithdrawResponseBuilder setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public WithdrawResponseBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public WithdrawResponseBuilder setProviderResponse(String providerResponse) {
        this.providerResponse = providerResponse;
        return this;
    }

    public WithdrawResponseBuilder setPayment(Payment payment) {
        this.payment = payment;
        return this;
    }

    public WithdrawResponse build() {
        WithdrawResponse withdrawResponse = new WithdrawResponse();
        withdrawResponse.setSuccess(success);
        withdrawResponse.setTransactionId(transactionId);
        withdrawResponse.setMessage(message);
        withdrawResponse.setProviderResponse(providerResponse);
        withdrawResponse.setPayment(payment);
        return withdrawResponse;
    }
}
