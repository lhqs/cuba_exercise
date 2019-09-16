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
);