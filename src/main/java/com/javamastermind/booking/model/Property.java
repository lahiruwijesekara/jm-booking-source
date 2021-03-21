package com.javamastermind.booking.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author lahiru_w
 */
@Document
public class Property
{

    @Id
    private ObjectId _id;

    private String propertyName;

    private String location;

    private String noOfRooms;

    private String starRating;

    private String latitude;

    private String longitude;

    private Offers offers;
    
    public Offers getOffers()
    {
        return offers;
    }

    public void setOffers(Offers offers)
    {
        this.offers = offers;
    }

    public String getPropertyName()
    {
        return propertyName;
    }

    public void setPropertyName(String propertyName)
    {
        this.propertyName = propertyName;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getNoOfRooms()
    {
        return noOfRooms;
    }

    public void setNoOfRooms(String noOfRooms)
    {
        this.noOfRooms = noOfRooms;
    }

    public String getStarRating()
    {
        return starRating;
    }

    public void setStarRating(String starRating)
    {
        this.starRating = starRating;
    }

    public String getLatitude()
    {
        return latitude;
    }

    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }

    public String getLongitude()
    {
        return longitude;
    }

    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }

    public ObjectId get_id()
    {
        return _id;
    }

    public void set_id(ObjectId _id)
    {
        this._id = _id;
    }

    @Override
    public String toString()
    {
        return "Property [_id=" + _id + ", propertyName=" + propertyName + ", location=" + location + ", noOfRooms="
            + noOfRooms + ", starRating=" + starRating + ", latitude=" + latitude + ", longitude=" + longitude + "]";
    }

}
