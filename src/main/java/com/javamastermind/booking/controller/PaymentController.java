package com.javamastermind.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javamastermind.booking.domain.PayRequest;
import com.javamastermind.booking.domain.PayResponse;
import com.javamastermind.booking.service.PaymentService;

/**
 * @author lahiru_w
 */
@RestController
@CrossOrigin("*")
public class PaymentController
{
    @Autowired
    PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity<PayResponse> addToBookingQueue(@RequestBody PayRequest payRequest)
    {
        System.out.println(payRequest.toString());
        if (paymentService.doPayment(payRequest)) {
            PayResponse payResponse = new PayResponse();
            payResponse.setResponseCode("20");
            payResponse.setStatus("sucess");
            payResponse.setTransactionId(payRequest.getTranId());
            payResponse.setPaymentAmount(payRequest.getAmount());
            return new ResponseEntity<PayResponse>(payResponse, HttpStatus.OK);
        } else {
            PayResponse payResponse = new PayResponse();
            payResponse.setResponseCode("90");
            payResponse.setStatus("fail");
            payResponse.setTransactionId(payRequest.getTranId());
            payResponse.setPaymentAmount(payRequest.getAmount());
            return new ResponseEntity<PayResponse>(payResponse, HttpStatus.OK);
        }
    }
}
