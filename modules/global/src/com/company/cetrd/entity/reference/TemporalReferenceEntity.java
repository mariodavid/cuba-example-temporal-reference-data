package com.company.cetrd.entity.reference;

import javax.persistence.MappedSuperclass;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DatatypeFormatter;

@NamePattern("#getCaption|code,validFrom,validUntil")
@MappedSuperclass
public class TemporalReferenceEntity extends ReferenceEntity {
    private static final long serialVersionUID = 1778657793090146207L;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_FROM", nullable = false)
    protected Date validFrom;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_UNTIL")
    protected Date validUntil;

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


    public String getCaption() {
        DatatypeFormatter df = AppBeans.get(DatatypeFormatter.class);
        String validFromString = df.formatDate(validFrom);


        String result = code + " (";

        if (validUntil == null) {
            result += "from " + validFromString;
        }
        else {
            String validUntilString = df.formatDate(validUntil);
            result += validFromString + " - " + validUntilString;
        }
        result += ")";
        return result;

    }
}