package com.company.cetrd.entity.reference;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "CETRD_CUSTOMER_TYPE")
@Entity(name = "cetrd$CustomerType")
public class CustomerType extends StandardEntity {
    private static final long serialVersionUID = 3245653826750875960L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}