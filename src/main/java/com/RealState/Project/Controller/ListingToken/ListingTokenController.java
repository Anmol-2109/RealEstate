package com.RealState.Project.Controller.ListingToken;


import com.RealState.Project.DTO.ListingTokenDTO;
import com.RealState.Project.Entity.ListingToken;
import com.RealState.Project.Service.ListingPropertyServices;
import com.RealState.Project.Service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/listings")
@RequiredArgsConstructor
public class ListingTokenController {
    private final ListingPropertyServices listingPropertyServices;

    @GetMapping
    public List<ListingTokenDTO> getAllListingProperties(){
        return listingPropertyServices.getAllListedProperties();
    }

    @PostMapping
    public ListingTokenDTO createListings(@RequestBody ListingTokenDTO listingTokenDTO ){
            return listingPropertyServices.createListingToken(listingTokenDTO);
    }

    @GetMapping("/{listingId}")
    public ListingTokenDTO getListingPropertiesById(@PathVariable("listingId") Long listingId){
        return listingPropertyServices.getListedPropertyById(listingId);
    }

    @PutMapping("/{listingId}")
    public ListingTokenDTO updateListedProperties(@PathVariable Long listingId, @RequestBody ListingTokenDTO listingTokenDTO){
        return listingPropertyServices.updateListingPropertyByID(listingId, listingTokenDTO);
    }

    @DeleteMapping("/{listingId}")
    public Void deleteListingProperties(@PathVariable Long listingId){
         listingPropertyServices.deleteListingPropertyById(listingId);
         return null;
    }
}
