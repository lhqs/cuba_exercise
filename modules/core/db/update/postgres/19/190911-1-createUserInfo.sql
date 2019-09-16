create table TUZHUANG_USER_INFO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USERNAME varchar(255) not null,
    SEX integer not null,
    MOBILE_PHONE varchar(255) not null,
    CREATE_TIME timestamp not null,
    --
    primary key (ID)
);