package com.company.cetrd.entity;

import javax.annotation.PostConstruct;
import javax.persistence.MappedSuperclass;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.UserSessionSource;

@MappedSuperclass
public class TenantEntity extends StandardEntity {
    private static final long serialVersionUID = -8171903807001547522L;

    @Column(name = "TENANT", nullable = false)
    protected Integer tenant;

    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    public Integer getTenant() {
        return tenant;
    }



    @PostConstruct
    protected void init() {
        Integer tenant = readTenantIdFromSession();
        if (tenant != null) {
            setTenant(tenant);
        }
        else {
            throw new RuntimeException("Could not set tenant");
        }

    }

    private Integer readTenantIdFromSession() {
        return AppBeans.get(UserSessionSource.class).getUserSession().getAttribute("tenant");
    }
}