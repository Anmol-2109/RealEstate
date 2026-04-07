package com.RealState.Project.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RevenuePointDTO {

    private String label;
    private Double revenue;

}