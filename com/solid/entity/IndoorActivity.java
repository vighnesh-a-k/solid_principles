package com.solid.entity;
import com.ilp.interfaces.*;

//Concrete class for indoor activities
public class IndoorActivity extends Activity implements Bookable {
 private int capacity;

 public IndoorActivity(String name, String location, int capacity, int durationInMinutes) {
     super(name, location, durationInMinutes);
     this.capacity = capacity;
 }

 @Override
 public void displayActivityDetails() {
     System.out.println("Indoor Activity: " + getName());
     System.out.println("Location: " + getLocation());
     System.out.println("Capacity: " + capacity + " people");
     System.out.println("Duration: " + getDurationInMinutes() + " minutes");
     System.out.println();
 }

 @Override
 public String book() {
     // Add booking logic here and generate a booking ID
     String bookingId = "INDOOR_" + getName() + "_BOOKING_ID";
     System.out.println("Booking ID for " + getName() + ": " + bookingId);
     return bookingId;
 }
}

