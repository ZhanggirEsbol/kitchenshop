package com.company.shop.web.screens.items;

import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.Items;

@UiController("shop_Items.edit")
@UiDescriptor("items-edit.xml")
@EditedEntityContainer("itemsDc")
@LoadDataBeforeShow
public class ItemsEdit extends StandardEditor<Items> {
}