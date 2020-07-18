package com.ecom.shipment.services;

import com.ecom.shipment.dalc.entities.FourthLevel;
import com.ecom.shipment.dalc.repositories.IFourthLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FourthLevelService {

    @Autowired private IFourthLevelRepository fourthLevelRepository;

    public FourthLevel save(@NotNull FourthLevel entity){
        entity.setIdFourthLevel(null);
        entity.setCreated(new Date());
        fourthLevelRepository.save(entity);
        return entity;
    }

    public FourthLevel findById(@NotNull Long id){
        Optional<FourthLevel> entity = fourthLevelRepository.findById(id);
        if(entity.isPresent()){
            return entity.get();
        }
        else {
            return null;
        }
    }

    public List<FourthLevel> findAll(){
        return fourthLevelRepository.findAll();
    }

    public boolean deleteById(Long id){
        if(this.findById(id) != null){
            fourthLevelRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}
