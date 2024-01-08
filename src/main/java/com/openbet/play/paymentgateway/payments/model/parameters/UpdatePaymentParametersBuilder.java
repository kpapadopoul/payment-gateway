package com.openbet.play.paymentgateway.payments.model.parameters;

import com.openbet.play.paymentgateway.payments.model.PaymentStatus;

public final class UpdatePaymentParametersBuilder {
    private String transactionId;
    private PaymentStatus paymentStatus;

    private UpdatePaymentParametersBuilder() {
    }

    public static UpdatePaymentParametersBuilder anUpdatePaymentParameters() {
        return new UpdatePaymentParametersBuilder();
    }

    public UpdatePaymentParametersBuilder setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public UpdatePaymentParametersBuilder setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    public UpdatePaymentParameters build() {
        UpdatePaymentParameters updatePaymentParameters = new UpdatePaymentParameters();
        updatePaymentParameters.setTransactionId(transactionId);
        updatePaymentParameters.setPaymentStatus(paymentStatus);
        return updatePaymentParameters;
    }
}
