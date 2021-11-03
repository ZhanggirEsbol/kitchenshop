package com.company.shop.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "SHOP_ORDERS")
@Entity(name = "shop_Orders")
public class Orders extends StandardEntity {
    private static final long serialVersionUID = 7856869724994453816L;

    @ManyToOne
    @JoinColumn(name = "OBLASTS")
    private Regions regions;

    @Temporal(TemporalType.DATE)
    @Column(name = "GIVEDATE")
    private Date givedate;

    @Temporal(TemporalType.DATE)
    @Column(name = "TAKEDATE")
    private Date takedate;

    @ManyToOne
    @JoinColumn(name = "ITEM")
    private Items item;

    public Regions getRegions() {
        return regions;
    }

    public void setRegions(Regions regions) {
        this.regions = regions;
    }

    public Date getGivedate() {
        return givedate;
    }

    public void setGivedate(Date givedate) {
        this.givedate = givedate;
    }

    public Date getTakedate() {
        return takedate;
    }

    public void setTakedate(Date takedate) {
        this.takedate = takedate;
    }

    public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }
}