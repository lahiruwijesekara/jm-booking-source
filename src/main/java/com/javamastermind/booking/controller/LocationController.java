package com.javamastermind.booking.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javamastermind.booking.model.Property;
import com.javamastermind.booking.service.PropertyService;

/**
 * @author lahiru_w
 */
@RestController
public class LocationController
{
    @Autowired
    PropertyService propertyService;

    @GetMapping("/locations")
    public ResponseEntity<Set<String>> getLocations()
    {
        try {
            return new ResponseEntity<Set<String>>(propertyService.getLocations(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_GATEWAY);
        }
    }

    @GetMapping("/locations/{location}/properties")
    public ResponseEntity<List<Property>> getProperties(@PathVariable String location)
    {
        try {
            return new ResponseEntity<List<Property>>(propertyService.getProperties(location), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_GATEWAY);
        }
    }
}
