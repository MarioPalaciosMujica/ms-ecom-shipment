package com.ecom.shipment.services;

import com.ecom.shipment.dalc.entities.ShipmentCharge;
import com.ecom.shipment.dalc.repositories.IShiptmentChargeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ShipmentChargeService {

    @Autowired private IShiptmentChargeRepository shiptmentChargeRepository;

    public ShipmentCharge save(@NotNull ShipmentCharge entity){
        entity.setIdShipmentCharge(null);
        entity.setCreated(new Date());
        shiptmentChargeRepository.save(entity);
        return entity;
    }

    public ShipmentCharge findById(@NotNull Long id){
        Optional<ShipmentCharge> entity = shiptmentChargeRepository.findById(id);
        if(entity.isPresent()){
            return entity.get();
        }
        else {
            return null;
        }
    }

    public List<ShipmentCharge> findAll(){
        return shiptmentChargeRepository.findAll();
    }

    public boolean deleteById(Long id){
        if(this.findById(id) != null){
            shiptmentChargeRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}
