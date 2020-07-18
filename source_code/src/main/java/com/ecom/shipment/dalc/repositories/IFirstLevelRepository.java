package com.ecom.shipment.dalc.repositories;

import com.ecom.shipment.dalc.entities.FirstLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFirstLevelRepository extends JpaRepository<FirstLevel, Long> {
}
