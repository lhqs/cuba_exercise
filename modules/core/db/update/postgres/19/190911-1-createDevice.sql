create table TUZHUANG_DEVICE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DEVICE_NAME varchar(255) not null,
    DEVICE_STATUS date not null,
    --
    primary key (ID)
);