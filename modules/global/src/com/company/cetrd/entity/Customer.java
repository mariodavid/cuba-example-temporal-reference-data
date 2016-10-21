package com.company.cetrd.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Set;
import javax.persistence.OneToMany;
import com.company.cetrd.entity.reference.CustomerType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.company.cetrd.entity.reference.PaymentMethod;

@NamePattern("%s|name")
@Table(name = "CETRD_CUSTOMER")
@Entity(name = "cetrd$Customer")
public class Customer extends TenantEntity {
    private static final long serialVersionUID = 8841553621515843153L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "customer")
    protected Set<Order> orders;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_TYPE_ID")
    protected CustomerType customerType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PREFERRED_PAYMENT_METHOD_ID")
    protected PaymentMethod preferredPaymentMethod;

    public void setPreferredPaymentMethod(PaymentMethod preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public PaymentMethod getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }


    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }


    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Order> getOrders() {
        return orders;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}