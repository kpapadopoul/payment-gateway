package com.openbet.play.paymentgateway.payments.repository;

import com.openbet.play.paymentgateway.payments.model.Payment;
import com.openbet.play.paymentgateway.payments.repository.dao.PaymentDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class PaymentRepository {
    private final PaymentDAO paymentDAO;

    public PaymentRepository() {
        this.paymentDAO = new PaymentDAO();
    }

    public List<Payment> getAll() {
        return paymentDAO.getAll();
    }

    public Payment getById(String id) {
        return paymentDAO.getById(id).orElseThrow(NoSuchElementException::new);
    }

    public boolean create(Payment payment) {
        return paymentDAO.create(payment);
    }

    public boolean delete(String id) {
        return paymentDAO.delete(id);
    }

    public boolean update(Payment payment) {
        return paymentDAO.update(payment);
    }
}
