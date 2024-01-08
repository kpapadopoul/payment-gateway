package com.openbet.play.paymentgateway.payments.model.parameters;

import com.openbet.play.paymentgateway.payments.model.PayMethodType;
import com.openbet.play.paymentgateway.payments.model.ProviderType;

import java.math.BigDecimal;

public class WithdrawParameters {
    private ProviderType provider;
    private String channel;
    private PayMethodType method;
    private BigDecimal amount;
    private String currency;
    private String payMethodToken;
    private String customerIp;

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

    public String getPayMethodToken() {
        return payMethodToken;
    }

    public void setPayMethodToken(String payMethodToken) {
        this.payMethodToken = payMethodToken;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }
}
