/**
 * 
 */
package com.javamastermind.booking.service.impl;

import com.javamastermind.booking.model.Offers;
import com.javamastermind.booking.model.Property;
import com.javamastermind.booking.model.User;
import com.javamastermind.booking.service.OfferService;

/**
 * @author lahiru_w
 */
public class OfferServiceImpl implements OfferService
{

    @Override
    public Offers getOffers(User user, Property property)
    {
        if ("VIP".equals(user.getAccountStatus())) {
            return property.getOffers();
        }
        return null;
    }

}
