package com.openbet.play.paymentgateway.payments.service;

import com.openbet.play.paymentgateway.gateways.GatewayFactory;
import com.openbet.play.paymentgateway.payments.model.Payment;
import com.openbet.play.paymentgateway.payments.model.PaymentBuilder;
import com.openbet.play.paymentgateway.payments.model.PaymentStatus;
import com.openbet.play.paymentgateway.payments.model.PaymentType;
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
import com.openbet.play.paymentgateway.payments.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final GatewayFactory gatewayFactory;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository, GatewayFactory gatewayFactory) {
        this.paymentRepository = paymentRepository;
        this.gatewayFactory = gatewayFactory;
    }

    public DepositResponse deposit(DepositParameters depositParameters) {
        final String transactionId = UUID.randomUUID().toString();

        final Payment payment = PaymentBuilder.aPayment()
                .setId(transactionId)
                .setDate(new Date())
                .setPaymentType(PaymentType.DEPOSIT)
                .setStatus(PaymentStatus.PENDING)
                .setPayMethodTypeRef(depositParameters.getMethod())
                .setProvider(depositParameters.getProvider())
                .setCurrency(depositParameters.getCurrency())
                .setAmount(depositParameters.getAmount())
                .setChannel(depositParameters.getChannel())
                .build();

        final boolean isCreated = paymentRepository.create(payment);
        if (!isCreated) return DepositResponseBuilder.aDepositResponse().setSuccess(false).build();

        // TODO: Add code to combine the deposit response returned by the respective gateway with the transaction id and the payment.
        final DepositResponse depositResponse =
                gatewayFactory.getGateway(depositParameters.getMethod())
                        .deposit(depositParameters);

        depositResponse.setTransactionId(transactionId);
        depositResponse.setPayment(payment);

        return depositResponse;
    }

    public WithdrawResponse withdraw(WithdrawParameters withdrawParameters) {
        final String transactionId = UUID.randomUUID().toString();

        final Payment payment = PaymentBuilder.aPayment()
                .setId(transactionId)
                .setDate(new Date())
                .setPaymentType(PaymentType.WITHDRAWAL)
                .setStatus(PaymentStatus.PENDING)
                .setPayMethodTypeRef(withdrawParameters.getMethod())
                .setProvider(withdrawParameters.getProvider())
                .setCurrency(withdrawParameters.getCurrency())
                .setAmount(withdrawParameters.getAmount())
                .setChannel(withdrawParameters.getChannel())
                .build();

        final boolean isCreated = paymentRepository.create(payment);
        if (!isCreated) return WithdrawResponseBuilder.aWithdrawResponse().setSuccess(false).build();

        // TODO: Add code to combine the withdraw response returned by the respective gateway with the transaction id and the payment.
        final WithdrawResponse withdrawResponse =
                gatewayFactory.getGateway(withdrawParameters.getMethod())
                        .withdraw(withdrawParameters);

        withdrawResponse.setTransactionId(transactionId);
        withdrawResponse.setPayment(payment);

        return withdrawResponse;
    }

    public CompletePaymentResponse completePayment(CompletePaymentParameters completePaymentParameters) {
        final Payment payment = paymentRepository.getById(completePaymentParameters.getTransactionId());

        // TODO: Decide whether updating database should be before or after executing the respective gateway actions.
        payment.setStatus(PaymentStatus.COMPLETED);
        final boolean isUpdated = paymentRepository.update(payment);
        if (!isUpdated) return CompletePaymentResponseBuilder.aCompletePaymentResponse().setSuccess(false).build();

        // TODO: Add code to combine the complete-payment response returned by the respective gateway with the transaction id and the payment.
        final CompletePaymentResponse completePaymentResponse =
                gatewayFactory.getGateway(payment.getPayMethodTypeRef())
                        .completePayment(completePaymentParameters);

        completePaymentResponse.setTransactionId(completePaymentParameters.getTransactionId());
        completePaymentResponse.setPayment(payment);

        return completePaymentResponse;
    }

    public UpdatePaymentResponse updatePayment(UpdatePaymentParameters updatePaymentParameters) {
        final Payment payment = paymentRepository.getById(updatePaymentParameters.getTransactionId());

        // TODO: Decide whether updating database should be before or after executing the respective gateway actions.
        payment.setStatus(updatePaymentParameters.getPaymentStatus());
        final boolean isUpdated = paymentRepository.update(payment);
        if (!isUpdated) return UpdatePaymentResponseBuilder.anUpdatePaymentResponse().setSuccess(false).build();

        // TODO: Add code to combine the update-payment response returned by the respective gateway with the transaction id and the payment.
        final UpdatePaymentResponse updatePaymentResponse =
                gatewayFactory.getGateway(payment.getPayMethodTypeRef())
                        .updatePayment(updatePaymentParameters);

        updatePaymentResponse.setTransactionId(updatePaymentParameters.getTransactionId());
        updatePaymentResponse.setPayment(payment);

        return updatePaymentResponse;
    }

    public CancelPaymentResponse cancelPayment(CancelPaymentParameters cancelPaymentParameters) {
        final Payment payment = paymentRepository.getById(cancelPaymentParameters.getTransactionId());

        // TODO: Decide whether updating database should be before or after executing the respective gateway actions.
        payment.setStatus(PaymentStatus.CANCELLED);
        final boolean isUpdated = paymentRepository.update(payment);
        if (!isUpdated) return CancelPaymentResponseBuilder.aCancelPaymentResponse().setSuccess(false).build();

        // TODO: Add code to combine the cancel-payment response returned by the respective gateway with the transaction id and the payment.
        final CancelPaymentResponse cancelPaymentResponse =
                gatewayFactory.getGateway(payment.getPayMethodTypeRef())
                        .cancelPayment(cancelPaymentParameters);

        cancelPaymentResponse.setTransactionId(cancelPaymentParameters.getTransactionId());
        cancelPaymentResponse.setPayment(payment);

        return cancelPaymentResponse;
    }

    public List<Payment> getHistory() {
        return paymentRepository.getAll();
    }

    public Payment getPaymentInfo(String id) {
        return paymentRepository.getById(id);
    }

}
