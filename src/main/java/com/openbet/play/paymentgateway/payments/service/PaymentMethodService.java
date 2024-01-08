package com.openbet.play.paymentgateway.payments.service;

import com.openbet.play.paymentgateway.payments.model.PaymentMethod;
import com.openbet.play.paymentgateway.payments.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodService {
    private final PaymentMethodRepository paymentMethodRepository;

    @Autowired
    public PaymentMethodService(PaymentMethodRepository paymentMethodRepository) {
        this.paymentMethodRepository = paymentMethodRepository;
    }

    public List<PaymentMethod> getAll() {
        return paymentMethodRepository.getAll();
    }
}
