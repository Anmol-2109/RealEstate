package com.RealState.Project.Service;

import com.RealState.Project.DTO.ListingTokenDTO;

import java.util.List;

public interface ListingPropertyServices {

    List<ListingTokenDTO> getAllListedProperties();
    ListingTokenDTO createListingToken(ListingTokenDTO listingTokenDTO);
    ListingTokenDTO getListedPropertyById(Long listingTokenId);
    ListingTokenDTO updateListingPropertyByID(Long tokenId,ListingTokenDTO listingTokenDTO);
    void  deleteListingPropertyById(Long listingTokenId);

}
