alter table TUZHUANG_PRODUCT add column CREATE_TIME timestamp ^
alter table TUZHUANG_PRODUCT alter column CREATE_TIME set not null ;
alter table TUZHUANG_PRODUCT add column PRODUCT_ID varchar(255) ^
update TUZHUANG_PRODUCT set PRODUCT_ID = '' where PRODUCT_ID is null ;
alter table TUZHUANG_PRODUCT alter column PRODUCT_ID set not null ;
alter table TUZHUANG_PRODUCT add column PRODUCT_NAME varchar(255) ^
update TUZHUANG_PRODUCT set PRODUCT_NAME = '' where PRODUCT_NAME is null ;
alter table TUZHUANG_PRODUCT alter column PRODUCT_NAME set not null ;
