package com.openbet.play.paymentgateway.payments.model.parameters;

import com.openbet.play.paymentgateway.payments.model.PayMethodType;
import com.openbet.play.paymentgateway.payments.model.ProviderType;

import java.math.BigDecimal;

public final class DepositParametersBuilder {
    private ProviderType provider;
    private String channel;
    private PayMethodType method;
    private BigDecimal amount;
    private String currency;

    private DepositParametersBuilder() {
    }

    public static DepositParametersBuilder aDepositParameters() {
        return new DepositParametersBuilder();
    }

    public DepositParametersBuilder setProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    public DepositParametersBuilder setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public DepositParametersBuilder setMethod(PayMethodType method) {
        this.method = method;
        return this;
    }

    public DepositParametersBuilder setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public DepositParametersBuilder setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public DepositParameters build() {
        DepositParameters depositParameters = new DepositParameters();
        depositParameters.setProvider(provider);
        depositParameters.setChannel(channel);
        depositParameters.setMethod(method);
        depositParameters.setAmount(amount);
        depositParameters.setCurrency(currency);
        return depositParameters;
    }
}
