package com.company.cetrd.service.tenant

import com.company.cetrd.entity.tenant.Tenant
import com.haulmont.cuba.core.global.DataManager
import com.haulmont.cuba.core.global.LoadContext
import org.springframework.stereotype.Service

import javax.inject.Inject

@Service(TenantService.NAME)
public class TenantServiceBean implements TenantService {


    @Inject
    DataManager dataManager

    @Override
    Tenant getTenantForTenantId(Integer tenantId) {
        LoadContext loadContext = LoadContext.create(Tenant)
                .setQuery(LoadContext.createQuery('select e from cetrd$Tenant e where e.tenantid = :tenantId').setParameter("tenantId", tenantId)
        )

        dataManager.load(loadContext)
    }
}