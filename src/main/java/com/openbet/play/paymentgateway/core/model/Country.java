package com.openbet.play.paymentgateway.core.model;

import java.util.Objects;

public class Country {
    private String codeISO2;
    private String codeISO3;
    private String name;
    private String numericCode;

    public String getCodeISO2() {
        return codeISO2;
    }

    public void setCodeISO2(String codeISO2) {
        this.codeISO2 = codeISO2;
    }

    public String getCodeISO3() {
        return codeISO3;
    }

    public void setCodeISO3(String codeISO3) {
        this.codeISO3 = codeISO3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(codeISO2, country.codeISO2) &&
                Objects.equals(codeISO3, country.codeISO3) &&
                Objects.equals(name, country.name) &&
                Objects.equals(numericCode, country.numericCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeISO2, codeISO3, name, numericCode);
    }

    @Override
    public String toString() {
        return "Country{" +
                "codeISO2='" + codeISO2 + '\'' +
                ", codeISO3='" + codeISO3 + '\'' +
                ", name='" + name + '\'' +
                ", numericCode='" + numericCode + '\'' +
                '}';
    }
}
