package com.company.shop.web.screens.orders;

import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.Orders;

@UiController("shop_Orders.edit")
@UiDescriptor("orders-edit.xml")
@EditedEntityContainer("ordersDc")
@LoadDataBeforeShow
public class OrdersEdit extends StandardEditor<Orders> {
}