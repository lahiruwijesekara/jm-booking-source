package com.javamastermind.booking.service;

import com.javamastermind.booking.domain.PayRequest;

public interface PaymentService
{
    public boolean doPayment(PayRequest payRequest);
    
    public boolean mockIpg(PayRequest payRequest);
}
