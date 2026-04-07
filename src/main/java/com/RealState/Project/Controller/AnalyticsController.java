package com.RealState.Project.Controller;

import com.RealState.Project.Entity.Type.AnalyticsType;
import com.RealState.Project.Service.AnalyticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/analytics")
public class AnalyticsController {

    private final AnalyticsService analyticsService;

    @GetMapping("/revenue")
    public ResponseEntity<?> revenue(

            @RequestParam(defaultValue = "MONTHLY")
            AnalyticsType type

    ){

        return ResponseEntity.ok(

                analyticsService.getRevenueAnalytics(type)

        );
    }

}