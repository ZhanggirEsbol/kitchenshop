package com.company.shop.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;

public enum OblastEnum implements EnumClass<Integer> {
    AQMOLA(1),
    ALMATY(2),
    JAMBYL(3),
    TUKRESTAN(4),
    ZAPAD(5);

    private Integer id;

    OblastEnum(Integer id){this.id=id;}

    @Override
    public Integer getId(){return id;}

    @Nullable
    public static OblastEnum fromId(Integer id){
        for (OblastEnum at:OblastEnum.values()){
            if(at.getId().equals(id)){
                return at;
            }
        }
        return null;
    }
}
