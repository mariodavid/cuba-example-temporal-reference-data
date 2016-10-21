package com.company.cetrd.web.reference.taxrate

import com.company.cetrd.entity.reference.TaxRate
import com.company.cetrd.entity.reference.TemporalReferenceEntity
import com.company.cetrd.web.reference.TemporalReferenceEntityBrowse
import com.haulmont.cuba.gui.data.CollectionDatasource

import javax.inject.Inject

public class TaxRateBrowse extends TemporalReferenceEntityBrowse {

    @Inject
    CollectionDatasource<TaxRate, UUID> taxRatesDs

    @Override
    CollectionDatasource<TemporalReferenceEntity, UUID> getDatasource() {
        return taxRatesDs
    }

    @Override
    String getEntityName() {
        return 'cetrd$TaxRate'
    }
}