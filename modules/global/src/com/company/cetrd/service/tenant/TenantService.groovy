package com.company.cetrd.service.tenant

import com.company.cetrd.entity.tenant.Tenant


public interface TenantService {
    String NAME = "cetrd_TenantService";

    public Tenant getTenantForTenantId(Integer tenantId)
}