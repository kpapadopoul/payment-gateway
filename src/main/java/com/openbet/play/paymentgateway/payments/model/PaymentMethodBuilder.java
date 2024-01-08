package com.openbet.play.paymentgateway.payments.model;

public final class PaymentMethodBuilder {
    private String code;
    private String description;

    private PaymentMethodBuilder() {
    }

    public static PaymentMethodBuilder aPaymentMethod() {
        return new PaymentMethodBuilder();
    }

    public PaymentMethodBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public PaymentMethodBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public PaymentMethod build() {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setCode(code);
        paymentMethod.setDescription(description);
        return paymentMethod;
    }
}
