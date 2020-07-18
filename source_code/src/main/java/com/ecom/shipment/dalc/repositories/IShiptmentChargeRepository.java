package com.ecom.shipment.dalc.repositories;

import com.ecom.shipment.dalc.entities.ShipmentCharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IShiptmentChargeRepository extends JpaRepository<ShipmentCharge, Long> {
}
