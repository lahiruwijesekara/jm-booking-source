package com.javamastermind.booking.service.impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamastermind.booking.model.Property;
import com.javamastermind.booking.repository.PropertyRepository;
import com.javamastermind.booking.service.PropertyService;

/**
 * @author lahiru_w
 */
@Service
public class PropertyServiceImpl implements PropertyService
{

    @Autowired
    PropertyRepository propertyRepository;

    @Override
    public Set<String> getLocations()
    {
        return propertyRepository.findAll().stream().map(Property::getLocation).collect(Collectors.toSet());
    }

    @Override
    public List<Property> getProperties(String location)
    {
        return propertyRepository.findAll().stream().filter(property -> location.equals(property.getLocation()))
            .collect(Collectors.toList());
    }

}
