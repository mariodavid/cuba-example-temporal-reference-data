package com.company.cetrd.web.reference.paymentmethod

import com.company.cetrd.entity.reference.PaymentMethod
import com.company.cetrd.entity.reference.TemporalReferenceEntity
import com.company.cetrd.web.reference.TemporalReferenceEntityBrowse
import com.haulmont.cuba.gui.data.CollectionDatasource

import javax.inject.Inject

public class PaymentMethodBrowse extends TemporalReferenceEntityBrowse {

    @Inject
    CollectionDatasource<PaymentMethod, UUID> paymentMethodsDs

    @Override
    CollectionDatasource<TemporalReferenceEntity, UUID> getDatasource() {
        return paymentMethodsDs
    }

    @Override
    String getEntityName() {
        return 'cetrd$PaymentMethod'
    }
}