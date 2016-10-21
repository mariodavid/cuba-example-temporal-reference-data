package com.company.cetrd.entity.reference.tenant;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.company.cetrd.entity.reference.CustomerType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.company.cetrd.entity.tenant.Tenant;
import javax.persistence.UniqueConstraint;

@Table(name = "CETRD_TENANT_CUSTOMER_TYPE", uniqueConstraints = {
    @UniqueConstraint(name = "IDX_CETRD_TENANT_CUSTOMER_TYPE_UNQ", columnNames = {"CUSTOMER_TYPE_ID", "TENANT_ID", "DELETE_TS"})
})
@Entity(name = "cetrd$TenantCustomerType")
public class TenantCustomerType extends StandardEntity {
    private static final long serialVersionUID = 7912491183949899095L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_TYPE_ID")
    protected CustomerType customerType;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TENANT_ID")
    protected Tenant tenant;

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Tenant getTenant() {
        return tenant;
    }


    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }


}