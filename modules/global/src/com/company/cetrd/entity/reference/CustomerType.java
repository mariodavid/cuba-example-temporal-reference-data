package com.company.cetrd.entity.reference;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s (%s)|name,code")
@Table(name = "CETRD_CUSTOMER_TYPE")
@Entity(name = "cetrd$CustomerType")
public class CustomerType extends ReferenceEntity {
    private static final long serialVersionUID = 3245653826750875960L;


}