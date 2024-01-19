package com.ilp.utility;

import com.ilp.sevices.BookingServices;
import com.solid.entity.IndoorActivity;
import com.solid.entity.OutdoorActivity; // Added import for OutdoorActivity

public class ThingsUtility {
    public static void main(String[] args) {
        BookingServices bookingService = new BookingServices();

        IndoorActivity indoorActivity = new IndoorActivity("Basketball", "Sports Hall", 20, 60);
        OutdoorActivity outdoorActivity = new OutdoorActivity("Hiking", "Mountain Trail", "Hiking boots", 120);

        // Book activities using the BookingService
        bookingService.bookActivity(indoorActivity);
        bookingService.bookActivity(outdoorActivity);

        // Display booked IDs
        bookingService.displayBookings();
    }
}

