package com.openbet.play.paymentgateway.payments.model.parameters;

import com.openbet.play.paymentgateway.payments.model.PayMethodType;
import com.openbet.play.paymentgateway.payments.model.ProviderType;

import java.math.BigDecimal;

public final class WithdrawParametersBuilder {
    private ProviderType provider;
    private String channel;
    private PayMethodType method;
    private BigDecimal amount;
    private String currency;
    private String payMethodToken;
    private String customerIp;

    private WithdrawParametersBuilder() {
    }

    public static WithdrawParametersBuilder aWithdrawParameters() {
        return new WithdrawParametersBuilder();
    }

    public WithdrawParametersBuilder setProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    public WithdrawParametersBuilder setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public WithdrawParametersBuilder setMethod(PayMethodType method) {
        this.method = method;
        return this;
    }

    public WithdrawParametersBuilder setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public WithdrawParametersBuilder setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public WithdrawParametersBuilder setPayMethodToken(String payMethodToken) {
        this.payMethodToken = payMethodToken;
        return this;
    }

    public WithdrawParametersBuilder setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
        return this;
    }

    public WithdrawParameters build() {
        WithdrawParameters withdrawParameters = new WithdrawParameters();
        withdrawParameters.setProvider(provider);
        withdrawParameters.setChannel(channel);
        withdrawParameters.setMethod(method);
        withdrawParameters.setAmount(amount);
        withdrawParameters.setCurrency(currency);
        withdrawParameters.setPayMethodToken(payMethodToken);
        withdrawParameters.setCustomerIp(customerIp);
        return withdrawParameters;
    }
}
