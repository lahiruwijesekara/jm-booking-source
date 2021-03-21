package com.javamastermind.booking.domain;

/**
 * @author lahiru_w
 */
public class Property
{

    private String propertyName;

    private String location;

    private String noOfRooms;

    private String starRating;

    private String latitude;

    private String longitude;

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

    @Override
    public String toString()
    {
        return "Property [propertyName=" + propertyName + ", location=" + location + ", noOfRooms=" + noOfRooms
            + ", starRating=" + starRating + ", latitude=" + latitude + ", longitude=" + longitude + "]";
    }

}
