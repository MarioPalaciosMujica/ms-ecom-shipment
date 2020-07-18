package com.ecom.shipment.dalc.repositories;

import com.ecom.shipment.dalc.entities.LevelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILevelTypeRepository extends JpaRepository<LevelType, Long> {
}
