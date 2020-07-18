package com.ecom.shipment.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class LevelTypeModel {

    @JsonProperty("idLevelType")
    private Long idLevelType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("level")
    private int level;

    @JsonProperty("created")
    private Date created;

    @JsonProperty("modified")
    private Date modified;

}
