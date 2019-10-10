alter table TUZHUANG_PRODUCT rename column product_id to product_id__u49527 ;
alter table TUZHUANG_PRODUCT alter column product_id__u49527 drop not null ;
alter table TUZHUANG_PRODUCT add column PRODUCT_IDSS varchar(255) ^
update TUZHUANG_PRODUCT set PRODUCT_IDSS = '' where PRODUCT_IDSS is null ;
alter table TUZHUANG_PRODUCT alter column PRODUCT_IDSS set not null ;
