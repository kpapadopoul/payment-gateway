package com.openbet.play.paymentgateway.payments.model;

public enum PaymentStatus {
    APPROVED,
    PENDING,
    PROCESSING,
    COMPLETED,
    CANCELLED,
    INVALID,
    FAILED,
    INCOMPLETE,
    REFERRAL_REQUIRED,
    ON_HOLD,
    WAITING,
    ENDORSE,
    DISCREPANCY,
    UNKNOWN,
    INVESTIGATION,
    PENDING_SECURITY;

    public boolean isFailure() {
        return this == CANCELLED
                || this == INVALID
                || this == FAILED;
    }
}
