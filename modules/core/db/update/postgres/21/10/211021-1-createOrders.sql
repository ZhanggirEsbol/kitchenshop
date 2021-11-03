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
);