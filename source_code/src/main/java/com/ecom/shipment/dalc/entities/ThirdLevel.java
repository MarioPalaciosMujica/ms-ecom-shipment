package com.ecom.shipment.dalc.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "tbl_third_levels")
@NoArgsConstructor
public class ThirdLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_third_level", updatable = false, nullable = false, unique = true)
    private Long idThirdLevel;

    @Column(name = "code")
    @Size(max = 10, message = "code size not valid")
    private String code;

    @Column(name = "name", nullable = false)
    @Size(min = 2, max = 50, message = "name size not valid")
    private String name;

    @Column(name = "created", nullable = false)
    private Date created;

    @Column(name = "modified")
    private Date modified;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_level_type")
    private LevelType levelType;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "thirdLevel")
    private ShipmentCharge shipmentCharge;


    public Long getIdThirdLevel() {
        return idThirdLevel;
    }

    public void setIdThirdLevel(Long idThirdLevel) {
        this.idThirdLevel = idThirdLevel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public LevelType getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }

    public ShipmentCharge getShipmentCharge() {
        return shipmentCharge;
    }

    public void setShipmentCharge(ShipmentCharge shipmentCharge) {
        this.shipmentCharge = shipmentCharge;
    }
}
