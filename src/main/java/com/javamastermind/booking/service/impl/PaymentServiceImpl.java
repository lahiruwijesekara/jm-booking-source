package com.javamastermind.booking.service.impl;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

import org.springframework.stereotype.Service;

import com.javamastermind.booking.domain.Booking;
import com.javamastermind.booking.domain.Booking.RoomData;
import com.javamastermind.booking.domain.Booking.Visitors;
import com.javamastermind.booking.domain.PayRequest;
import com.javamastermind.booking.enums.Statuses;
import com.javamastermind.booking.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService
{

    @Override
    public boolean doPayment(PayRequest payRequest)
    {

        if (Objects.nonNull(payRequest)) {
            this.bookingOrder(payRequest);
            return true;
        } else {
            return false;
        }
    }
    
    public Supplier<Booking> bookingOrder(PayRequest payRequest)
    {
        Supplier<Booking> bookingSupplier = () -> {
            Booking booking = new Booking();
            booking.setBookedPrice(String.valueOf(new Random().nextInt(100000000 - 10000 + 1) + 10000));
            booking.setBookingTranId(new Random().nextInt() + "");
            booking.setBookingTranUUId(UUID.randomUUID().toString());
            booking.setCheckIn("22/3/2021");
            booking.setCheckOut("24/3/2021");
            booking.setPaymentType("online");
            booking.setPropertyID("1000154");
            RoomData roomdata = booking.new RoomData();
            roomdata.setBedsPerRoom("2");
            roomdata.setNoOfRooms("2");
            booking.setRoomdata(roomdata);
            booking.setStatus(Statuses.PENDING + "");
            booking.setUserId("acc");
            Visitors visitors = booking.new Visitors();
            visitors.setNoOfAdults("4");
            visitors.setNoOfChildren("1");
            booking.setVisitors(visitors);
            booking.setPayRequest(payRequest);
            return booking;
        };

        return bookingSupplier;
    }

    @Override
    public boolean mockIpg(PayRequest payRequest)
    {
        Long amount = 5000000L;
        if (Long.parseLong(payRequest.getAmount()) < amount) {
            return true;
        } else {
            return false;
        }
    }

}
