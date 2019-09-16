alter table TUZHUANG_DEVICE rename column device_status to device_status__u69737 ;
alter table TUZHUANG_DEVICE alter column device_status__u69737 drop not null ;
alter table TUZHUANG_DEVICE add column DEVICE_STATUS integer ^
update TUZHUANG_DEVICE set DEVICE_STATUS = 0 where DEVICE_STATUS is null ;
alter table TUZHUANG_DEVICE alter column DEVICE_STATUS set not null ;
