package com.ecom.shipment.services;

import com.ecom.shipment.dalc.entities.FirstLevel;
import com.ecom.shipment.dalc.repositories.IFirstLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FirstLevelService {

    @Autowired private IFirstLevelRepository firstLevelRepository;

    public FirstLevel save(@NotNull FirstLevel entity){
        entity.setIdFirstLevel(null);
        entity.setCreated(new Date());
        firstLevelRepository.save(entity);
        return entity;
    }

    public FirstLevel findById(@NotNull Long id){
        Optional<FirstLevel> entity = firstLevelRepository.findById(id);
        if(entity.isPresent()){
            return entity.get();
        }
        else {
            return null;
        }
    }

    public List<FirstLevel> findAll(){
        return firstLevelRepository.findAll();
    }

    public boolean deleteById(Long id){
        if(this.findById(id) != null){
            firstLevelRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}
