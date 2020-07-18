package com.ecom.shipment.dalc.repositories;

import com.ecom.shipment.dalc.entities.FourthLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFourthLevelRepository extends JpaRepository<FourthLevel, Long> {
}
