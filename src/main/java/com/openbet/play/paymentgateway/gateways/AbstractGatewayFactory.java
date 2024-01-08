package com.openbet.play.paymentgateway.gateways;

import com.openbet.play.paymentgateway.payments.model.PayMethodType;

public interface AbstractGatewayFactory {
    public Gateway getGateway(PayMethodType type);
}
