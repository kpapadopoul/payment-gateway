package com.openbet.play.paymentgateway.core.repository;

import com.openbet.play.paymentgateway.core.model.Currency;
import com.openbet.play.paymentgateway.core.model.CurrencyBuilder;
import com.openbet.play.paymentgateway.core.repository.dao.CurrencyDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class CurrencyRepository {
    public List<Currency> getAll() {
        return getSampleCurrencies();
    }

    private List<Currency> getSampleCurrencies() {
        return Stream.of(CurrencyDAO.values())
                .map(this::map)
                .collect(Collectors.toList());
    }

    private Currency map(CurrencyDAO currencyDAO) {
        return CurrencyBuilder.aCurrency()
                .setCode(currencyDAO.getCode())
                .setDescription(currencyDAO.getDescription())
                .build();
    }
}
