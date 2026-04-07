package com.RealState.Project.Service;

import com.RealState.Project.DTO.Admin.RevenueAnalyticsDTO;
import com.RealState.Project.Entity.Type.AnalyticsType;

public interface AnalyticsService {

    RevenueAnalyticsDTO getRevenueAnalytics(
            AnalyticsType type
    );

}