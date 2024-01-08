package com.openbet.play.paymentgateway.payments.repository;

import com.openbet.play.paymentgateway.payments.model.PaymentMethod;
import com.openbet.play.paymentgateway.payments.model.PaymentMethodBuilder;
import com.openbet.play.paymentgateway.payments.repository.dao.PaymentMethodDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class PaymentMethodRepository {
    public List<PaymentMethod> getAll() {
        return getSamplePaymentMethods();
    }

    private List<PaymentMethod> getSamplePaymentMethods() {
        return Stream.of(PaymentMethodDAO.values())
                .map(this::map)
                .collect(Collectors.toList());
    }

    private PaymentMethod map(PaymentMethodDAO paymentMethodDAO) {
        return PaymentMethodBuilder.aPaymentMethod()
                .setCode(paymentMethodDAO.getCode())
                .setDescription(paymentMethodDAO.getDescription())
                .build();
    }
}
