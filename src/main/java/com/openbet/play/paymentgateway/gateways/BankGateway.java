package com.openbet.play.paymentgateway.gateways;

import com.openbet.play.paymentgateway.payments.model.parameters.CancelPaymentParameters;
import com.openbet.play.paymentgateway.payments.model.parameters.CompletePaymentParameters;
import com.openbet.play.paymentgateway.payments.model.parameters.DepositParameters;
import com.openbet.play.paymentgateway.payments.model.parameters.UpdatePaymentParameters;
import com.openbet.play.paymentgateway.payments.model.parameters.WithdrawParameters;
import com.openbet.play.paymentgateway.payments.model.responses.CancelPaymentResponse;
import com.openbet.play.paymentgateway.payments.model.responses.CancelPaymentResponseBuilder;
import com.openbet.play.paymentgateway.payments.model.responses.CompletePaymentResponse;
import com.openbet.play.paymentgateway.payments.model.responses.CompletePaymentResponseBuilder;
import com.openbet.play.paymentgateway.payments.model.responses.DepositResponse;
import com.openbet.play.paymentgateway.payments.model.responses.DepositResponseBuilder;
import com.openbet.play.paymentgateway.payments.model.responses.UpdatePaymentResponse;
import com.openbet.play.paymentgateway.payments.model.responses.UpdatePaymentResponseBuilder;
import com.openbet.play.paymentgateway.payments.model.responses.WithdrawResponse;
import com.openbet.play.paymentgateway.payments.model.responses.WithdrawResponseBuilder;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class BankGateway implements Gateway {
    private static final Logger LOGGER = getLogger(BankGateway.class);

    @Override
    public DepositResponse deposit(DepositParameters depositParameters) {
        LOGGER.info("Bank - deposit");
        return DepositResponseBuilder.aDepositResponse().setSuccess(true).build();
    }

    @Override
    public WithdrawResponse withdraw(WithdrawParameters withdrawParameters) {
        LOGGER.info("Bank - withdraw");
        return WithdrawResponseBuilder.aWithdrawResponse().setSuccess(true).build();
    }

    @Override
    public CompletePaymentResponse completePayment(CompletePaymentParameters completePaymentParameters) {
        LOGGER.info("Bank - complete payment");
        return CompletePaymentResponseBuilder.aCompletePaymentResponse().setSuccess(true).build();
    }

    @Override
    public UpdatePaymentResponse updatePayment(UpdatePaymentParameters updatePaymentParameters) {
        LOGGER.info("Bank - update payment");
        return UpdatePaymentResponseBuilder.anUpdatePaymentResponse().setSuccess(true).build();
    }

    @Override
    public CancelPaymentResponse cancelPayment(CancelPaymentParameters cancelPaymentParameters) {
        LOGGER.info("Bank - cancel payment");
        return CancelPaymentResponseBuilder.aCancelPaymentResponse().setSuccess(true).build();
    }
}
