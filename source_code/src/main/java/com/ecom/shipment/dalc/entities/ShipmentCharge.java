package com.ecom.shipment.dalc.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tbl_shipment_charges")
@NoArgsConstructor
public class ShipmentCharge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shipment_charge", updatable = false, nullable = false, unique = true)
    private Long idShipmentCharge;

    @Column(name = "name", nullable = false)
    @Size(min = 2, max = 50, message = "name size not valid")
    private String name;

    @Column(name = "comments", nullable = false)
    @Size(max = 255, message = "comments size not valid")
    private String comments;

    @Column(name = "fixed_amount")
    private BigDecimal fixedAmount;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "created", nullable = false)
    private Date created;

    @Column(name = "modified")
    private Date modified;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_country")
    private Country country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_first_level")
    private FirstLevel firstLevel;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_second_level")
    private SecondLevel secondLevel;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_third_level")
    private ThirdLevel thirdLevel;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fourth_level")
    private FourthLevel fourthLevel;


    public Long getIdShipmentCharge() {
        return idShipmentCharge;
    }

    public void setIdShipmentCharge(Long idShipmentCharge) {
        this.idShipmentCharge = idShipmentCharge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigDecimal getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(BigDecimal fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public FirstLevel getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(FirstLevel firstLevel) {
        this.firstLevel = firstLevel;
    }

    public SecondLevel getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(SecondLevel secondLevel) {
        this.secondLevel = secondLevel;
    }

    public ThirdLevel getThirdLevel() {
        return thirdLevel;
    }

    public void setThirdLevel(ThirdLevel thirdLevel) {
        this.thirdLevel = thirdLevel;
    }

    public FourthLevel getFourthLevel() {
        return fourthLevel;
    }

    public void setFourthLevel(FourthLevel fourthLevel) {
        this.fourthLevel = fourthLevel;
    }
}
