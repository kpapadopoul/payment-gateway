package com.openbet.play.paymentgateway.gateways;

import com.openbet.play.paymentgateway.payments.model.PayMethodType;
import org.springframework.stereotype.Component;

@Component
public class GatewayFactory implements AbstractGatewayFactory {
    private final Gateway bankGateway;
    private final Gateway topUpCardGateway;
    private final Gateway creditCardGateway;
    private final Gateway cashGateway;
    private final Gateway chequeGateway;
    private final Gateway paypalGateway;
    private final Gateway bankTransferGateway;
    private final Gateway provinciaNetGateway;
    private final Gateway genericGateway;

    public GatewayFactory() {
        this.bankGateway = new BankGateway();
        this.topUpCardGateway = new TopUpCardGateway();
        this.creditCardGateway = new CreditCardGateway();
        this.cashGateway = new CashGateway();
        this.chequeGateway = new ChequeGateway();
        this.paypalGateway = new PaypalGateway();
        this.bankTransferGateway = new BankTransferGateway();
        this.provinciaNetGateway = new ProvinciaNetGateway();
        this.genericGateway = new GenericGateway();
    }

    @Override
    public Gateway getGateway(PayMethodType type) {
        switch (type) {
            case BANK:
                return bankGateway;
            case TOPUP_CARD:
                return topUpCardGateway;
            case CREDIT_CARD:
                return creditCardGateway;
            case CASH:
                return cashGateway;
            case CHEQUE:
                return chequeGateway;
            case PAYPAL:
                return paypalGateway;
            case BANK_TRANSFER:
                return bankTransferGateway;
            case PROVINCIA_NET:
                return provinciaNetGateway;
            case GENERIC:
                return genericGateway;
            default:
                throw new IllegalArgumentException("Invalid payment method type: " + type);
        }
    }
}
