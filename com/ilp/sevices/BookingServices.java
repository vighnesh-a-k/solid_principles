package com.ilp.sevices;

import java.util.HashMap;
import java.util.Map;

import com.ilp.interfaces.Bookable;

public class BookingServices {
    private Map<String, String> bookings;

    public BookingServices() {
        this.bookings = new HashMap<>();
    }

    public String bookActivity(Bookable activity) {
        String bookingId = activity.book();
        
      
        System.out.println("Booking confirmed. Booking ID: " + bookingId);
        return bookingId;
    }

    public void displayBookings() {
        System.out.println("Bookings:");
        for (Map.Entry<String, String> entry : bookings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
