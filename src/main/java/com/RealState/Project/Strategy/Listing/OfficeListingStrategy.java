package com.RealState.Project.Strategy.Listing;

import com.RealState.Project.Entity.ListingToken;
import com.RealState.Project.Entity.Office;
import com.RealState.Project.Entity.Type.Status;
import com.RealState.Project.Entity.User;
import com.RealState.Project.Repository.ListingTokenRepository;
import com.RealState.Project.Repository.OfficeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class OfficeListingStrategy implements ListingAccessStrategy {

    private final OfficeRepository officeRepository;
    private final ListingTokenRepository listingRepository;

    @Override
    public List<ListingToken> getListings(User user) {

        Office office =
                officeRepository.findByUser(user)
                        .orElseThrow(() ->
                                new RuntimeException("Office not found")
                        );


        // ACTIVE listings of this office
        List<ListingToken> activeListings =
                listingRepository.findActiveListingsByOffice(
                        office
                );

        // INACTIVE listings that were transacted
        // where transaction agent belongs to
        // this office
        List<ListingToken> transactedListings =
                listingRepository
                        .findListingsInTransactionsByOffice(
                                office
                        );

        Set<ListingToken> result =
                new LinkedHashSet<>();

        result.addAll(activeListings);
        result.addAll(transactedListings);

        return new ArrayList<>(result);
    }

    @Override
    public boolean canAccess(ListingToken listing, User user){

        return listing
                .getPid()
                .getOffice()
                .getUser()
                .getId()
                .equals(user.getId());
    }
}