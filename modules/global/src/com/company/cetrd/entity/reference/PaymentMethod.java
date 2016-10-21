package com.company.cetrd.entity.reference;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@Table(name = "CETRD_PAYMENT_METHOD")
@Entity(name = "cetrd$PaymentMethod")
public class PaymentMethod extends TemporalReferenceEntity {
    private static final long serialVersionUID = 7788094656555742530L;


}