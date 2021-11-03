package com.company.shop.web.screens.regions;

import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.Regions;

@UiController("shop_Regions.browse")
@UiDescriptor("regions-browse.xml")
@LookupComponent("regionsesTable")
@LoadDataBeforeShow
public class RegionsBrowse extends StandardLookup<Regions> {
}