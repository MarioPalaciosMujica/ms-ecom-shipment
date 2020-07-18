package com.ecom.shipment.dalc.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tbl_level_types")
@NoArgsConstructor
public class LevelType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_level_type", updatable = false, nullable = false, unique = true)
    private Long idLevelType;

    @Column(name = "name", nullable = false)
    @Size(min = 2, max = 50, message = "name size not valid")
    private String name;

    @Column(name = "created", nullable = false)
    private Date created;

    @Column(name = "modified")
    private Date modified;

    @OneToMany(mappedBy = "levelType", fetch = FetchType.LAZY)
    private Set<Country> countries;

    @OneToMany(mappedBy = "levelType", fetch = FetchType.LAZY)
    private Set<FirstLevel> firstLevels;

    @OneToMany(mappedBy = "levelType", fetch = FetchType.LAZY)
    private Set<SecondLevel> secondLevels;

    @OneToMany(mappedBy = "levelType", fetch = FetchType.LAZY)
    private Set<ThirdLevel> thirdLevels;

    @OneToMany(mappedBy = "levelType", fetch = FetchType.LAZY)
    private Set<FourthLevel> fourthLevels;


    public Long getIdLevelType() {
        return idLevelType;
    }

    public void setIdLevelType(Long idLevelType) {
        this.idLevelType = idLevelType;
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

    public Set<Country> getCountries() {
        return countries;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }

    public Set<FirstLevel> getFirstLevels() {
        return firstLevels;
    }

    public void setFirstLevels(Set<FirstLevel> firstLevels) {
        this.firstLevels = firstLevels;
    }

    public Set<SecondLevel> getSecondLevels() {
        return secondLevels;
    }

    public void setSecondLevels(Set<SecondLevel> secondLevels) {
        this.secondLevels = secondLevels;
    }

    public Set<ThirdLevel> getThirdLevels() {
        return thirdLevels;
    }

    public void setThirdLevels(Set<ThirdLevel> thirdLevels) {
        this.thirdLevels = thirdLevels;
    }

    public Set<FourthLevel> getFourthLevels() {
        return fourthLevels;
    }

    public void setFourthLevels(Set<FourthLevel> fourthLevels) {
        this.fourthLevels = fourthLevels;
    }
}
