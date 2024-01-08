package com.openbet.play.paymentgateway.payments.repository.dao;

import com.openbet.play.paymentgateway.payments.model.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class PaymentDAO {
    private final List<Payment> payments;

    public PaymentDAO() {
        this.payments = new ArrayList<>();
    }

    public List<Payment> getAll() {
        return payments;
    }

    public Optional<Payment> getById(String id) {
        return payments.stream()
                .filter(payment -> payment.getId().equals(id))
                .findFirst();
    }

    public boolean create(Payment payment) {
        return payments.add(payment);
    }

    public boolean delete(String id) {
        return payments.removeIf(payment -> payment.getId().equals(id));
    }

    public boolean update(Payment payment) {
        if (delete(payment.getId())) return create(payment);

        throw new NoSuchElementException();
    }

}
