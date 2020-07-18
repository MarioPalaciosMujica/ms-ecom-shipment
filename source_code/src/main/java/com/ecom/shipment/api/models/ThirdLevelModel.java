package com.ecom.shipment.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class ThirdLevelModel {

    @JsonProperty("idThirdLevel")
    private Long idThirdLevel;

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

    @JsonProperty("fourthLevels")
    private List<FourthLevelModel> fourthLevels;
}
