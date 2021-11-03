package com.company.shop.web.screens.items;

import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.Items;

@UiController("shop_Items.browse")
@UiDescriptor("items-browse.xml")
@LookupComponent("itemsesTable")
@LoadDataBeforeShow
public class ItemsBrowse extends StandardLookup<Items> {
}