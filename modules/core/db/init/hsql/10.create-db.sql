-- begin CETRD_CUSTOMER
create table CETRD_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    TENANT integer not null,
    --
    NAME varchar(255) not null,
    CUSTOMER_TYPE_ID varchar(36),
    PREFERRED_PAYMENT_METHOD_ID varchar(36),
    --
    primary key (ID)
)^
-- end CETRD_CUSTOMER
-- begin CETRD_CUSTOMER_TYPE
create table CETRD_CUSTOMER_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    --
    primary key (ID)
)^
-- end CETRD_CUSTOMER_TYPE
-- begin CETRD_ORDER
create table CETRD_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    TENANT integer not null,
    --
    CUSTOMER_ID varchar(36) not null,
    ORDER_DATE date not null,
    PAYMENT_METHOD_ID varchar(36) not null,
    NET_PRICE double precision not null,
    TAX_RATE_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CETRD_ORDER
-- begin CETRD_PAYMENT_METHOD
create table CETRD_PAYMENT_METHOD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    VALID_FROM date not null,
    VALID_UNTIL date,
    --
    primary key (ID)
)^
-- end CETRD_PAYMENT_METHOD
-- begin CETRD_TAX_RATE
create table CETRD_TAX_RATE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    VALID_FROM date not null,
    VALID_UNTIL date,
    --
    RATE integer not null,
    --
    primary key (ID)
)^
-- end CETRD_TAX_RATE
-- begin CETRD_TENANT_CUSTOMER_TYPE
create table CETRD_TENANT_CUSTOMER_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_TYPE_ID varchar(36) not null,
    TENANT_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CETRD_TENANT_CUSTOMER_TYPE
-- begin CETRD_TENANT
create table CETRD_TENANT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TENANTID integer not null,
    --
    primary key (ID)
)^
-- end CETRD_TENANT
