package com.company.cetrd.web.reference

import com.company.cetrd.entity.reference.TemporalReferenceEntity
import com.haulmont.cuba.gui.WindowParam
import com.haulmont.cuba.gui.components.AbstractLookup
import com.haulmont.cuba.gui.data.CollectionDatasource

abstract public class TemporalReferenceEntityBrowse extends AbstractLookup {


    @WindowParam
    Date validReferenceDate


    @Override
    void init(Map<String, Object> params) {

        super.init(params)

        if (validReferenceDate) {
            getDatasource().setQuery('select e from ' + getEntityName() + ' e where @dateBefore(e.validFrom, :param$validReferenceDate) and (@dateAfter(e.validUntil, :param$validReferenceDate) or e.validUntil is null)')
        }
    }

    abstract CollectionDatasource<TemporalReferenceEntity, UUID> getDatasource();
    abstract String getEntityName();
}