package com.javamastermind.booking;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javamastermind.booking.domain.Booking;
import com.javamastermind.booking.domain.Booking.RoomData;
import com.javamastermind.booking.domain.Booking.Visitors;
import com.javamastermind.booking.enums.Statuses;

/**
 * @author lahiru_w
 */
@SpringBootApplication
public class JmBookingSourceApplication
{
    private static final Logger log = LoggerFactory.getLogger(JmBookingSourceApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(JmBookingSourceApplication.class, args);
        log.info("Booking source application has started to run");
    }

    @Bean
    public Supplier<Booking> bookingOrder()
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
            log.info("{} {} for ${} for {}", booking.getStatus(), booking.getBookingTranUUId(),
                booking.getBookedPrice(), booking.getUserId(), booking);
            return booking;
        };

        return bookingSupplier;
    }
}
