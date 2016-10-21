alter table CETRD_PAYMENT_METHOD add column VALID_FROM date default current_date not null ;
alter table CETRD_PAYMENT_METHOD add column VALID_UNTIL date ;
alter table CETRD_PAYMENT_METHOD add column CODE varchar(255) default '' not null ;
