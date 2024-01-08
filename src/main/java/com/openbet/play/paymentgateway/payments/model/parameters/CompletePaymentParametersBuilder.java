package com.openbet.play.paymentgateway.payments.model.parameters;

public final class CompletePaymentParametersBuilder {
    private String transactionId;

    private CompletePaymentParametersBuilder() {
    }

    public static CompletePaymentParametersBuilder aCompletePaymentParameters() {
        return new CompletePaymentParametersBuilder();
    }

    public CompletePaymentParametersBuilder setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public CompletePaymentParameters build() {
        CompletePaymentParameters completePaymentParameters = new CompletePaymentParameters();
        completePaymentParameters.setTransactionId(transactionId);
        return completePaymentParameters;
    }
}
