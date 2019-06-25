package com.worldpay.merchantoffer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.worldpay.merchantoffer.domain.Offer;
import com.worldpay.merchantoffer.domain.Status;

import java.util.List;

/**
 *
 * Offer JPA Respository
 *
 * @author Nicholas Goldsworthy
 * @since 2018-01-07
 */

@Repository
public interface OfferRepository extends CrudRepository<Offer,Long> {

    List<Offer> findAllByMerchantId(long merchantId);
    List<Offer> findAllByStatus(Status status);
}
