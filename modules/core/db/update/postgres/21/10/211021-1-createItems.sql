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
);