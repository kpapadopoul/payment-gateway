package com.openbet.play.paymentgateway.payments.model.parameters;

import com.openbet.play.paymentgateway.payments.model.PayMethodType;
import com.openbet.play.paymentgateway.payments.model.ProviderType;

import java.math.BigDecimal;

public class DepositParameters {
    private ProviderType provider;
    private String channel;
    private PayMethodType method;
    private BigDecimal amount;
    private String currency;

    public ProviderType getProvider() {
        return provider;
    }

    public void setProvider(ProviderType provider) {
        this.provider = provider;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public PayMethodType getMethod() {
        return method;
    }

    public void setMethod(PayMethodType method) {
        this.method = method;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
