package com.app.vaistramanagement.dao;

import com.app.vaistramanagement.dto.CountryDto;
import com.app.vaistramanagement.dto.CountryDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CountryService
{

    CountryDto addCountry(CountryDto countryDto);

    CountryDto getCountryById(int id);

    List<CountryDto> getAllCountries(int pageNumber, int pageSize, String sortBy, String sortDirection);

    CountryDto updateCountry(CountryDto country, int id);

    String deleteCountryById(int id);

    String softDeleteCountryById(int id);

    String restoreCountryById(int id);

}

