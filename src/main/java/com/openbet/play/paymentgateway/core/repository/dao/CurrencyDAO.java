package com.openbet.play.paymentgateway.core.repository.dao;

public enum CurrencyDAO {

    ARS("ARS", "Argentine Peso"),
    BRL("BRL","Brazilian Real"),
    CAD("CAD", "Canadian Dollar"),
    EUR("EUR", "Euro"),
    GBP("GBP", "British Pound"),
    SGD("SGD", "Singapore Dollar"),
    USD("USD", "US Dollar");

    private final String code;
    private final String description;

    CurrencyDAO(String code, String description) {
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
