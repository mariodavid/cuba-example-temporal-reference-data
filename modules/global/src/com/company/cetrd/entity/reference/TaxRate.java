package com.company.cetrd.entity.reference;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s (%s - %s)|rate,validFrom,validUntil")
@Table(name = "CETRD_TAX_RATE")
@Entity(name = "cetrd$TaxRate")
public class TaxRate extends StandardEntity {
    private static final long serialVersionUID = 2322641152440272735L;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_FROM", nullable = false)
    protected Date validFrom;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_UNTIL")
    protected Date validUntil;

    @Column(name = "RATE", nullable = false)
    protected Integer rate;

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getRate() {
        return rate;
    }


}