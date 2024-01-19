package com.solid.entity;


abstract class Sites extends ThingToDo {
 private String entranceFee;
 private boolean guidedTourAvailable;

 public Sites(String name, String location, String entranceFee, boolean guidedTourAvailable) {
     super(name, location);
     this.entranceFee = entranceFee;
     this.guidedTourAvailable = guidedTourAvailable;
 }

 public String getEntranceFee() {
     return entranceFee;
 }

 public boolean isGuidedTourAvailable() {
     return guidedTourAvailable;
 }
}
