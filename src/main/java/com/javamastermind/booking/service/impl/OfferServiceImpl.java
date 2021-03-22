/**
 * 
 */
package com.javamastermind.booking.service.impl;

import org.springframework.stereotype.Service;

import com.javamastermind.booking.model.Offers;
import com.javamastermind.booking.model.Property;
import com.javamastermind.booking.model.User;
import com.javamastermind.booking.service.OfferService;

/**
 * @author lahiru_w
 */
@Service
public class OfferServiceImpl implements OfferService
{

    @Override
    public Offers getOffers(User user, Property property)
    {
        if ("premium".equals(user.getAccountStatus())) {
            return property.getOffers();
        } else {
            return null;
        }
    }

}
