package com.RealState.Project.Controller.PropertyController;

import com.RealState.Project.DTO.PropertyRequestDTO;
import com.RealState.Project.Entity.Property;
import com.RealState.Project.Service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/properties")
@RequiredArgsConstructor
public class UserPropertyController {
    private final PropertyService propertyService;

    @PostMapping
    public PropertyRequestDTO addNewProperty(@RequestBody PropertyRequestDTO propertyRequestDTO) {
        return propertyService.addProperty(propertyRequestDTO);
    }

    @GetMapping("/{propertyId}")
    public PropertyRequestDTO getPropertyById(@PathVariable Long propertyId) {
        return propertyService.getPropertyById(propertyId);
    }

    @PutMapping("/{propertyId}")
    public PropertyRequestDTO updateProperty(@PathVariable Long propertyId, @RequestBody PropertyRequestDTO propertyRequestDTO) {
        return propertyService.updateProperty(propertyId, propertyRequestDTO);
    }

    @DeleteMapping("/{propertyId}")
    public Void deleteProperty(@PathVariable Long propertyId) {
         propertyService.deletePropertyByID(propertyId);
         return null;
    }

}
