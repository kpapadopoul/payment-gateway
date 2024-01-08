package com.openbet.play.paymentgateway.payments.repository.dao;

public enum PaymentMethodDAO {

    CSH("CSH", "Cash"),
    CHQ("CHQ", "Check"),
    CC("CC", "Credit Card"),
    TOPC("TOPC", "Top Up Card"),
    BANK("BANK", "Bank Transfer"),
    PPAL("PPAL", "Paypal"),
    APAY("APAY", "Apple Pay"),
    PNET("PNET", "Provincia NET");

    private final String code;
    private final String description;

    PaymentMethodDAO(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
