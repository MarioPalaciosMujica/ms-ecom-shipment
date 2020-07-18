package com.ecom.shipment.dalc.repositories;

import com.ecom.shipment.dalc.entities.SecondLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISecondLevelRepository extends JpaRepository<SecondLevel, Long> {
}
