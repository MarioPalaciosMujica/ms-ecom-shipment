package com.ecom.shipment.services;

import com.ecom.shipment.dalc.entities.SecondLevel;
import com.ecom.shipment.dalc.repositories.ISecondLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SecondLevelService {

    @Autowired private ISecondLevelRepository secondLevelRepository;

    public SecondLevel save(@NotNull SecondLevel entity){
        entity.setIdSecondLevel(null);
        entity.setCreated(new Date());
        secondLevelRepository.save(entity);
        return entity;
    }

    public SecondLevel findById(@NotNull Long id){
        Optional<SecondLevel> entity = secondLevelRepository.findById(id);
        if(entity.isPresent()){
            return entity.get();
        }
        else {
            return null;
        }
    }

    public List<SecondLevel> findAll(){
        return secondLevelRepository.findAll();
    }

    public boolean deleteById(Long id){
        if(this.findById(id) != null){
            secondLevelRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}
