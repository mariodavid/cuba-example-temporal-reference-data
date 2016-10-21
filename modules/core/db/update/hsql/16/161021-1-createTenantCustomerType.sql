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
);
