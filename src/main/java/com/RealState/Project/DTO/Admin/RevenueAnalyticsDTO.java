package com.RealState.Project.DTO.Admin;

import com.RealState.Project.DTO.RevenuePointDTO;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RevenueAnalyticsDTO {

    private Double totalRevenue;
    private Double weeklyRevenue;
    private Double monthlyRevenue;
    private Double revenueFromSell;
    private Double revenueFromRent;

    private List<RevenuePointDTO> chart;

}