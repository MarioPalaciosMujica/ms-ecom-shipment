package com.ecom.shipment.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class SecondLevelModel {

    @JsonProperty("idSecondLevel")
    private Long idSecondLevel;

    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;

    @JsonProperty("created")
    private Date created;

    @JsonProperty("modified")
    private Date modified;

    @JsonProperty("levelType")
    private LevelTypeModel levelType;

    @JsonProperty("shipmentCharge")
    private ShipmentChargeModel shipmentCharge;

    @JsonProperty("thirdLevels")
    private List<ThirdLevelModel> thirdLevels;
}
