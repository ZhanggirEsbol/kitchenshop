package com.company.shop.web.screens.orders;

import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.Orders;

@UiController("shop_Orders.browse")
@UiDescriptor("orders-browse.xml")
@LookupComponent("ordersesTable")
@LoadDataBeforeShow
public class OrdersBrowse extends StandardLookup<Orders> {
}