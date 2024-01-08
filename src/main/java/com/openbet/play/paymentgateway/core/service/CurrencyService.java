package com.openbet.play.paymentgateway.core.service;

import com.openbet.play.paymentgateway.core.model.Currency;
import com.openbet.play.paymentgateway.core.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {
    private final CurrencyRepository currencyRepository;

    @Autowired
    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public List<Currency> getAll() {
        return currencyRepository.getAll();
    }
}
