package com.RealState.Project.Service;

import com.RealState.Project.DTO.PropertyRequestDTO;

public interface PropertyService {
    PropertyRequestDTO addProperty(PropertyRequestDTO request) ;

    PropertyRequestDTO updateProperty(Long pid, PropertyRequestDTO request);

    void deletePropertyByID(Long id);

    // get property corresponding to ID
    PropertyRequestDTO getPropertyById(Long id);
}
