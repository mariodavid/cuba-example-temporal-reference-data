package com.company.cetrd.entity.reference;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DatatypeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CETRD_TAX_RATE")
@Entity(name = "cetrd$TaxRate")
public class TaxRate extends TemporalReferenceEntity {
    private static final long serialVersionUID = 2322641152440272735L;

    @Column(name = "RATE", nullable = false)
    protected Integer rate;

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getRate() {
        return rate;
    }

}