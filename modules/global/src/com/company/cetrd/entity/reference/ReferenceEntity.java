package com.company.cetrd.entity.reference;

import javax.persistence.MappedSuperclass;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@MappedSuperclass
public class ReferenceEntity extends StandardEntity {
    private static final long serialVersionUID = -9065974365759299021L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "CODE", nullable = false)
    protected String code;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }


}