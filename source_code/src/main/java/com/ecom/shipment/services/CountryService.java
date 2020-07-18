package com.ecom.shipment.services;

import com.ecom.shipment.dalc.entities.Country;
import com.ecom.shipment.dalc.repositories.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired private ICountryRepository countryRepository;

    public Country save(@NotNull Country entity){
        entity.setIdCountry(null);
        entity.setCreated(new Date());
        countryRepository.save(entity);
        return entity;
    }

    public Country findById(@NotNull Long id){
        Optional<Country> entity = countryRepository.findById(id);
        if(entity.isPresent()){
            return entity.get();
        }
        else {
            return null;
        }
    }

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

    public boolean deleteById(Long id){
        if(this.findById(id) != null){
            countryRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}
