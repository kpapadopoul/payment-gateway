package com.openbet.play.paymentgateway.core.repository;

import com.openbet.play.paymentgateway.core.model.Country;
import com.openbet.play.paymentgateway.core.model.CountryBuilder;
import com.openbet.play.paymentgateway.core.repository.dao.CountryDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class CountryRepository {
    public List<Country> getAll() {
        return getSampleCountries();
    }

    private List<Country> getSampleCountries() {
        return Stream.of(CountryDAO.values())
                .map(this::map)
                .collect(Collectors.toList());
    }

    private Country map(CountryDAO countryDAO) {
        return CountryBuilder.aCountry()
                .setCodeISO2(countryDAO.getCodeISO2())
                .setCodeISO3(countryDAO.getCodeISO3())
                .setName(countryDAO.getName())
                .setNumericCode(countryDAO.getNumericCode())
                .build();
    }
}
