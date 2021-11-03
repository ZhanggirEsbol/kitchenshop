-- begin SHOP_ORDERS
alter table SHOP_ORDERS add constraint FK_SHOP_ORDERS_ON_OBLASTS foreign key (OBLASTS) references SHOP_REGIONS(ID)^
alter table SHOP_ORDERS add constraint FK_SHOP_ORDERS_ON_ITEM foreign key (ITEM) references SHOP_ITEMS(ID)^
create index IDX_SHOP_ORDERS_ON_OBLASTS on SHOP_ORDERS (OBLASTS)^
create index IDX_SHOP_ORDERS_ON_ITEM on SHOP_ORDERS (ITEM)^
-- end SHOP_ORDERS
