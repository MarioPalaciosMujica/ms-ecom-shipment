package com.ecom.shipment.dalc.repositories;

import com.ecom.shipment.dalc.entities.ThirdLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IThirdLevelRepository extends JpaRepository<ThirdLevel, Long> {
}
