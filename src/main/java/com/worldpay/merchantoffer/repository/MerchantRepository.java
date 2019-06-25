package com.worldpay.merchantoffer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.worldpay.merchantoffer.domain.Merchant;

/**
 *
 * Merchant JPA Respository
 *
 * @author Nicholas Goldsworthy
 * @since 2018-01-07
 */
@Repository
public interface MerchantRepository extends CrudRepository<Merchant,Long> {
}
