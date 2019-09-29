create table TUZHUANG_WORK_ORDER (
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
    PRODUCT_LINE_ID uuid,
    PRODUCT_ID uuid,
    PLAN_NUM bigint,
    FINISH_NUM bigint,
    START_TIME timestamp,
    END_TIME timestamp,
    --
    primary key (ID)
);