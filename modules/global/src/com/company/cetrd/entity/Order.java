package com.company.cetrd.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.company.cetrd.entity.reference.PaymentMethod;
import com.company.cetrd.entity.reference.TaxRate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s (%s)|orderDate,netPrice")
@Table(name = "CETRD_ORDER")
@Entity(name = "cetrd$Order")
public class Order extends TenantEntity {
    private static final long serialVersionUID = 1820330251951130803L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @Temporal(TemporalType.DATE)
    @Column(name = "ORDER_DATE", nullable = false)
    protected Date orderDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PAYMENT_METHOD_ID")
    protected PaymentMethod paymentMethod;

    @Column(name = "NET_PRICE", nullable = false)
    protected Double netPrice;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TAX_RATE_ID")
    protected TaxRate taxRate;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setNetPrice(Double netPrice) {
        this.netPrice = netPrice;
    }

    public Double getNetPrice() {
        return netPrice;
    }

    public void setTaxRate(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public TaxRate getTaxRate() {
        return taxRate;
    }


}