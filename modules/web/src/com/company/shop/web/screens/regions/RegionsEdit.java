package com.company.shop.web.screens.regions;

import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.Regions;

@UiController("shop_Regions.edit")
@UiDescriptor("regions-edit.xml")
@EditedEntityContainer("regionsDc")
@LoadDataBeforeShow
public class RegionsEdit extends StandardEditor<Regions> {
}