package com.ecom.shipment.services;

import com.ecom.shipment.dalc.entities.LevelType;
import com.ecom.shipment.dalc.repositories.ILevelTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LevelTypeService {

    @Autowired private ILevelTypeRepository levelTypeRepository;

    public LevelType save(@NotNull LevelType entity){
        entity.setIdLevelType(null);
        entity.setCreated(new Date());
        levelTypeRepository.save(entity);
        return entity;
    }

    public LevelType findById(@NotNull Long id){
        Optional<LevelType> entity = levelTypeRepository.findById(id);
        if(entity.isPresent()){
            return entity.get();
        }
        else {
            return null;
        }
    }

    public List<LevelType> findAll(){
        return levelTypeRepository.findAll();
    }

    public boolean deleteById(Long id){
        if(this.findById(id) != null){
            levelTypeRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}
