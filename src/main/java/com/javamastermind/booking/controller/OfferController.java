package com.javamastermind.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javamastermind.booking.domain.OfferRequest;
import com.javamastermind.booking.model.Offers;
import com.javamastermind.booking.model.Property;
import com.javamastermind.booking.model.User;
import com.javamastermind.booking.service.OfferService;

@RestController
@CrossOrigin("*")
public class OfferController
{
    @Autowired
    OfferService offerService;

    @GetMapping("/offers")
    public ResponseEntity<Offers> getOffers(@RequestBody OfferRequest offerRequest)
    {
        try {
            User user = offerRequest.getUser();
            Property property = offerRequest.getProperty();
            
            return new ResponseEntity<Offers>(offerService.getOffers(user, property), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_GATEWAY);
        }
    }
}
