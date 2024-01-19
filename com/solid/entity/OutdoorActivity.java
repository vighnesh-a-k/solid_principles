package com.solid.entity;

import com.ilp.interfaces.Bookable;

//Concrete class for outdoor activities
public class OutdoorActivity extends Activity implements Bookable {
 private String equipmentRequired;

 public OutdoorActivity(String name, String location, String equipmentRequired, int durationInMinutes) {
     super(name, location, durationInMinutes);
     this.equipmentRequired = equipmentRequired;
 }

 @Override
 public void displayActivityDetails() {
     System.out.println("Outdoor Activity: " + getName());
     System.out.println("Location: " + getLocation());
     System.out.println("Equipment Required: " + equipmentRequired);
     System.out.println("Duration: " + getDurationInMinutes() + " minutes");
     System.out.println();
 }

 @Override
 public String book() {
     // Add booking logic here and generate a booking ID
     String bookingId = "OUTDOOR_" + getName() + "_BOOKING_ID";
     System.out.println("Booking ID for " + getName() + ": " + bookingId);
     return bookingId;
 }
}
