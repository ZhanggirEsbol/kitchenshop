-- begin SHOP_ORDERS
create table SHOP_ORDERS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    OBLASTS uuid,
    GIVEDATE date,
    TAKEDATE date,
    ITEM uuid,
    --
    primary key (ID)
)^
-- end SHOP_ORDERS
-- begin SHOP_REGIONS
create table SHOP_REGIONS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    OBLASTS integer,
    CITY varchar(255),
    --
    primary key (ID)
)^
-- end SHOP_REGIONS
-- begin SHOP_ITEMS
create table SHOP_ITEMS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    MODEL varchar(255),
    COLOR varchar(255),
    PRICE integer,
    CATEGORY varchar(255),
    --
    primary key (ID)
)^
-- end SHOP_ITEMS
