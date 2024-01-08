package com.openbet.play.paymentgateway.payments.model;

import java.math.BigDecimal;
import java.util.Date;

public final class PaymentBuilder {
    private String id;
    private Date date;
    private PaymentStatus status;
    private String statusMessage;
    private PaymentType paymentType;
    private PayMethodType payMethodTypeRef;
    private String payMethodRef;
    private ProviderType provider;
    private String currency;
    private BigDecimal amount;
    private String channel;
    private String voucherNumber;
    private String authorisationCode;
    private String confirmationNumber;

    private PaymentBuilder() {
    }

    public static PaymentBuilder aPayment() {
        return new PaymentBuilder();
    }

    public PaymentBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public PaymentBuilder setDate(Date date) {
        this.date = date;
        return this;
    }

    public PaymentBuilder setStatus(PaymentStatus status) {
        this.status = status;
        return this;
    }

    public PaymentBuilder setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    public PaymentBuilder setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public PaymentBuilder setPayMethodTypeRef(PayMethodType payMethodTypeRef) {
        this.payMethodTypeRef = payMethodTypeRef;
        return this;
    }

    public PaymentBuilder setPayMethodRef(String payMethodRef) {
        this.payMethodRef = payMethodRef;
        return this;
    }

    public PaymentBuilder setProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    public PaymentBuilder setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public PaymentBuilder setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public PaymentBuilder setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public PaymentBuilder setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
        return this;
    }

    public PaymentBuilder setAuthorisationCode(String authorisationCode) {
        this.authorisationCode = authorisationCode;
        return this;
    }

    public PaymentBuilder setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
        return this;
    }

    public Payment build() {
        Payment payment = new Payment();
        payment.setId(id);
        payment.setDate(date);
        payment.setStatus(status);
        payment.setStatusMessage(statusMessage);
        payment.setPaymentType(paymentType);
        payment.setPayMethodTypeRef(payMethodTypeRef);
        payment.setPayMethodRef(payMethodRef);
        payment.setProvider(provider);
        payment.setCurrency(currency);
        payment.setAmount(amount);
        payment.setChannel(channel);
        payment.setVoucherNumber(voucherNumber);
        payment.setAuthorisationCode(authorisationCode);
        payment.setConfirmationNumber(confirmationNumber);
        return payment;
    }
}
