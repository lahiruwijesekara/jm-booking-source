package com.javamastermind.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javamastermind.booking.model.Offers;

/**
 * @author lahiru_w
 *
 */
@Repository
public interface OffersRepository extends MongoRepository<Offers, String>
{

}
