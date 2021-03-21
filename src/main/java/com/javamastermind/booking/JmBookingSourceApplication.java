package com.javamastermind.booking;

import java.util.UUID;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javamastermind.booking.domain.Booking;

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
            Booking booking = new Booking(UUID.randomUUID().toString(), "100", "1200.00");
            log.info("{} {} for ${} for {}", booking.getStatus(), booking.getBookingTranUUId(),
                booking.getBookedPrice(), booking.getUserId());
            return booking;
        };

        return bookingSupplier;
    }
}
