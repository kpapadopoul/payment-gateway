package com.openbet.play.paymentgateway.core.model;

public final class CountryBuilder {
    private String codeISO2;
    private String codeISO3;
    private String name;
    private String numericCode;

    private CountryBuilder() {
    }

    public static CountryBuilder aCountry() {
        return new CountryBuilder();
    }

    public CountryBuilder setCodeISO2(String codeISO2) {
        this.codeISO2 = codeISO2;
        return this;
    }

    public CountryBuilder setCodeISO3(String codeISO3) {
        this.codeISO3 = codeISO3;
        return this;
    }

    public CountryBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CountryBuilder setNumericCode(String numericCode) {
        this.numericCode = numericCode;
        return this;
    }

    public Country build() {
        Country country = new Country();
        country.setCodeISO2(codeISO2);
        country.setCodeISO3(codeISO3);
        country.setName(name);
        country.setNumericCode(numericCode);
        return country;
    }
}
