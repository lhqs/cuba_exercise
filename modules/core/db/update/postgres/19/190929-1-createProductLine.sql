create table TUZHUANG_PRODUCT_LINE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SERIAL varchar(255) not null,
    DEFINITION_ varchar(255) not null,
    CREATE_TIME timestamp not null,
    --
    primary key (ID)
);