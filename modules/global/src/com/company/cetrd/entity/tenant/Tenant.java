package com.company.cetrd.entity.tenant;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

@NamePattern("%s|name")
@Table(name = "CETRD_TENANT")
@Entity(name = "cetrd$Tenant")
public class Tenant extends StandardEntity {
    private static final long serialVersionUID = -7855844461816469713L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "TENANTID", nullable = false)
    protected Integer tenantid;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public Integer getTenantid() {
        return tenantid;
    }


}