package com.company.shop.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "SHOP_REGIONS")
@Entity(name = "shop_Regions")
public class Regions extends StandardEntity {
    private static final long serialVersionUID = -6977045441527920251L;

    @Column(name = "OBLASTS")
    private Integer  oblasts;

    @Column(name = "CITY")
    private String city;

    public OblastEnum getOblasts() {
        return oblasts == null ? null : OblastEnum.fromId(oblasts);
    }

    public void setOblasts(OblastEnum oblasts) {
        this.oblasts = oblasts == null ? null : oblasts.getId();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}