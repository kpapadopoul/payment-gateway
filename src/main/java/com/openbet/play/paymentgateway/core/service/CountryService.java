package com.openbet.play.paymentgateway.core.service;

import com.openbet.play.paymentgateway.core.model.Country;
import com.openbet.play.paymentgateway.core.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAll() {
        return countryRepository.getAll();
    }

}
