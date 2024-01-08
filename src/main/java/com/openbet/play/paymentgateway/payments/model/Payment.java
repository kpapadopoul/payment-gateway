package com.openbet.play.paymentgateway.payments.model;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public PayMethodType getPayMethodTypeRef() {
        return payMethodTypeRef;
    }

    public void setPayMethodTypeRef(PayMethodType payMethodTypeRef) {
        this.payMethodTypeRef = payMethodTypeRef;
    }

    public String getPayMethodRef() {
        return payMethodRef;
    }

    public void setPayMethodRef(String payMethodRef) {
        this.payMethodRef = payMethodRef;
    }

    public ProviderType getProvider() {
        return provider;
    }

    public void setProvider(ProviderType provider) {
        this.provider = provider;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public String getAuthorisationCode() {
        return authorisationCode;
    }

    public void setAuthorisationCode(String authorisationCode) {
        this.authorisationCode = authorisationCode;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
}
