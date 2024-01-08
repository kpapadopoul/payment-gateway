package com.openbet.play.paymentgateway.gateways;

import com.openbet.play.paymentgateway.payments.model.parameters.CancelPaymentParameters;
import com.openbet.play.paymentgateway.payments.model.parameters.CompletePaymentParameters;
import com.openbet.play.paymentgateway.payments.model.parameters.DepositParameters;
import com.openbet.play.paymentgateway.payments.model.parameters.UpdatePaymentParameters;
import com.openbet.play.paymentgateway.payments.model.parameters.WithdrawParameters;
import com.openbet.play.paymentgateway.payments.model.responses.CancelPaymentResponse;
import com.openbet.play.paymentgateway.payments.model.responses.CompletePaymentResponse;
import com.openbet.play.paymentgateway.payments.model.responses.DepositResponse;
import com.openbet.play.paymentgateway.payments.model.responses.UpdatePaymentResponse;
import com.openbet.play.paymentgateway.payments.model.responses.WithdrawResponse;

public interface Gateway {
    DepositResponse deposit(DepositParameters depositParameters);
    WithdrawResponse withdraw(WithdrawParameters withdrawParameters);
    CompletePaymentResponse completePayment(CompletePaymentParameters completePaymentParameters);
    UpdatePaymentResponse updatePayment(UpdatePaymentParameters updatePaymentParameters);
    CancelPaymentResponse cancelPayment(CancelPaymentParameters cancelPaymentParameters);
}
