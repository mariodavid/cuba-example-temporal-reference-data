package com.company.cetrd.web.tenant.reference.tenantcustomertype

import com.company.cetrd.entity.tenant.Tenant
import com.company.cetrd.service.tenant.TenantService
import com.haulmont.cuba.gui.components.AbstractEditor
import com.company.cetrd.entity.reference.tenant.TenantCustomerType
import com.haulmont.cuba.gui.components.PickerField
import com.haulmont.cuba.security.global.UserSession

import javax.inject.Inject
import javax.inject.Named

public class TenantCustomerTypeEdit extends AbstractEditor<TenantCustomerType> {


    @Inject
    UserSession userSession

    @Named("fieldGroup.tenant")
    PickerField tenantPickerField

    @Inject
    TenantService tenantService

    @Override
    protected void postInit() {

        Integer tenantId = userSession.getAttribute("tenant")

        if (tenantId) {
            tenantPickerField.setVisible(false)
            Tenant currentTenant = tenantService.getTenantForTenantId(tenantId)
            item.tenant = currentTenant
        }
    }
}