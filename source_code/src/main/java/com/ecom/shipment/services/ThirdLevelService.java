package com.ecom.shipment.services;

import com.ecom.shipment.dalc.entities.ThirdLevel;
import com.ecom.shipment.dalc.repositories.IThirdLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ThirdLevelService {

    @Autowired private IThirdLevelRepository thirdLevelRepository;

    public ThirdLevel save(@NotNull ThirdLevel entity){
        entity.setIdThirdLevel(null);
        entity.setCreated(new Date());
        thirdLevelRepository.save(entity);
        return entity;
    }

    public ThirdLevel findById(@NotNull Long id){
        Optional<ThirdLevel> entity = thirdLevelRepository.findById(id);
        if(entity.isPresent()){
            return entity.get();
        }
        else {
            return null;
        }
    }

    public List<ThirdLevel> findAll(){
        return thirdLevelRepository.findAll();
    }

    public boolean deleteById(Long id){
        if(this.findById(id) != null){
            thirdLevelRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}
