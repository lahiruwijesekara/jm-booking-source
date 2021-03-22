package com.javamastermind.booking.listner;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.javamastermind.booking.domain.Booking;
import com.javamastermind.booking.enums.Statuses;
import com.javamastermind.booking.events.PaymentProcessor;

/**
 * @author lahiru_w This class has implemented to check the updated status of Bookings from kafka | Confirmed or Not
 *         after payments
 */
@Component
public class PaymentChecker
{
    public static final Logger log = LoggerFactory.getLogger(PaymentChecker.class);

    /*
     * private PaymentProcessor paymentProcessor;
     * @Autowired public PaymentChecker(PaymentProcessor paymentProcessor) { this.paymentProcessor = paymentProcessor; }
     */

    //@StreamListener(PaymentProcessor.CONFIRMED_OUT)
    public void checkAndSortCOnfirmedBookings(Booking booking)
    {
        if (Objects.nonNull(booking)) {
            if (booking.getStatus().equals(Statuses.CONFIRMED + "")) {
                log.info(booking.getBookingTranUUId() + "has confirmed" + booking);
            }
        }
    }

}
