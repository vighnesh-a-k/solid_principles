package com.solid.entity;


class NatureSite extends Sites {
 private String ecosystemType;

 public NatureSite(String name, String location, String ecosystemType, boolean guidedTourAvailable) {
     super(name, location, ecosystemType, guidedTourAvailable);
     this.ecosystemType = ecosystemType;
 }

 @Override
 public void displayActivityDetails() {
     System.out.println("Nature Site: " + getName());
     System.out.println("Location: " + getLocation());
     System.out.println("Ecosystem Type: " + ecosystemType);
     System.out.println();
 }
}
