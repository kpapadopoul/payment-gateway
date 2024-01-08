package com.openbet.play.paymentgateway.core.repository.dao;

public enum CountryDAO {

    AR("AR", "ARG", "Argentina", "032"),
    BR("BR", "BRA", "Brazil", "076"),
    CA("CA", "CAN", "Canada", "124"),
    GR("GR", "GRC", "Greece", "300"),
    GBR("GB", "GBR", "United Kingdom of Great Britain and Northern Ireland", "826"),
    SG("SG", "SGP", "Singapore", "702"),
    USA("US", "USA", "United States of America", "840");

    private final String codeISO2;
    private final String codeISO3;
    private final String name;
    private final String numericCode;

    CountryDAO(String codeISO2, String codeISO3, String name, String numericCode) {
        this.codeISO2 = codeISO2;
        this.codeISO3 = codeISO3;
        this.name = name;
        this.numericCode = numericCode;
    }

    public String getCodeISO2() {
        return codeISO2;
    }

    public String getCodeISO3() {
        return codeISO3;
    }

    public String getName() {
        return name;
    }

    public String getNumericCode() {
        return numericCode;
    }

}
