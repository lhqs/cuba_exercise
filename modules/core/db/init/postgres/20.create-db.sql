-- begin TUZHUANG_WORK_ORDER
alter table TUZHUANG_WORK_ORDER add constraint FK_TUZHUANG_WORK_ORDER_ON_PRODUCT_LINE foreign key (PRODUCT_LINE_ID) references TUZHUANG_PRODUCT_LINE(ID)^
alter table TUZHUANG_WORK_ORDER add constraint FK_TUZHUANG_WORK_ORDER_ON_PRODUCT foreign key (PRODUCT_ID) references TUZHUANG_PRODUCT(ID)^
create index IDX_TUZHUANG_WORK_ORDER_ON_PRODUCT_LINE on TUZHUANG_WORK_ORDER (PRODUCT_LINE_ID)^
create index IDX_TUZHUANG_WORK_ORDER_ON_PRODUCT on TUZHUANG_WORK_ORDER (PRODUCT_ID)^
-- end TUZHUANG_WORK_ORDER
