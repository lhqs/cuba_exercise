-- begin TUZHUANG_USER_INFO
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
)^
-- end TUZHUANG_USER_INFO
-- begin TUZHUANG_DEVICE
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
    DEVICE_STATUS integer not null,
    WORK_TIME timestamp not null,
    --
    primary key (ID)
)^
-- end TUZHUANG_DEVICE
-- begin TUZHUANG_STATISTICS_INFO
create table TUZHUANG_STATISTICS_INFO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STATISTIC_ITEM varchar(255) not null,
    NUMBER_ integer not null,
    STATISTIC_TIME timestamp not null,
    --
    primary key (ID)
)^
-- end TUZHUANG_STATISTICS_INFO