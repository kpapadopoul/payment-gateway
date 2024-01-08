package com.openbet.play.paymentgateway.core.model;

public final class CurrencyBuilder {
    private String code;
    private String description;

    private CurrencyBuilder() {
    }

    public static CurrencyBuilder aCurrency() {
        return new CurrencyBuilder();
    }

    public CurrencyBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public CurrencyBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Currency build() {
        Currency currency = new Currency();
        currency.setCode(code);
        currency.setDescription(description);
        return currency;
    }
}
