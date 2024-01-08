package com.openbet.play.paymentgateway.payments.model.parameters;

public final class CancelPaymentParametersBuilder {
    private String transactionId;

    private CancelPaymentParametersBuilder() {
    }

    public static CancelPaymentParametersBuilder aCancelPaymentParameters() {
        return new CancelPaymentParametersBuilder();
    }

    public CancelPaymentParametersBuilder setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public CancelPaymentParameters build() {
        CancelPaymentParameters cancelPaymentParameters = new CancelPaymentParameters();
        cancelPaymentParameters.setTransactionId(transactionId);
        return cancelPaymentParameters;
    }
}
