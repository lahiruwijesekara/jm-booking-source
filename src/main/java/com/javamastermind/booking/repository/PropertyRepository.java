package com.javamastermind.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javamastermind.booking.model.Property;

/**
 * @author lahiru_w
 */
public interface PropertyRepository extends MongoRepository<Property, Long>
{

}
