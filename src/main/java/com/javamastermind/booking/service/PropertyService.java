package com.javamastermind.booking.service;

import java.util.List;
import java.util.Set;

import com.javamastermind.booking.model.Property;

/**
 * @author lahiru_w
 */
public interface PropertyService
{
    public Set<String> getLocations();

    public List<Property> getProperties(String location);
}
