/**
 * 
 */
package com.javamastermind.booking.service;

import com.javamastermind.booking.model.Offers;
import com.javamastermind.booking.model.Property;
import com.javamastermind.booking.model.User;

/**
 * @author lahiru_w
 *
 */
public interface OfferService
{
    public Offers getOffers(User user, Property property);
}
