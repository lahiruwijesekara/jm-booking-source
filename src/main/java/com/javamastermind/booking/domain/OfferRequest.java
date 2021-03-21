/**
 * 
 */
package com.javamastermind.booking.domain;

import com.javamastermind.booking.model.Property;
import com.javamastermind.booking.model.User;

/**
 * @author lahiru_w
 */
public class OfferRequest
{
    private Property property;

    private User user;
    
    public Property getProperty()
    {
        return property;
    }

    public void setProperty(Property property)
    {
        this.property = property;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public String toString()
    {
        return "OfferRequest [property=" + property + ", user=" + user + "]";
    }

}
