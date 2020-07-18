package com.ecom.shipment.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
public class ShipmentChargeModel {

    @JsonProperty("idShipmentCharge")
    private Long idShipmentCharge;

    @JsonProperty("name")
    private String name;

    @JsonProperty("comments")
    private String comments;

    @JsonProperty("fixedAmount")
    private BigDecimal fixedAmount;

    @JsonProperty("isActive")
    private boolean isActive;

    @JsonProperty("created")
    private Date created;

    @JsonProperty("modified")
    private Date modified;
}
