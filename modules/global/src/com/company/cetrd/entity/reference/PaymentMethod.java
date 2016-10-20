package com.company.cetrd.entity.reference;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "CETRD_PAYMENT_METHOD")
@Entity(name = "cetrd$PaymentMethod")
public class PaymentMethod extends StandardEntity {
    private static final long serialVersionUID = 7788094656555742530L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}