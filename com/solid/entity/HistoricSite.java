package com.solid.entity;


class HistoricSite extends Sites {
 private int establishedYear;

 public HistoricSite(String name, String location, int establishedYear, boolean guidedTourAvailable) {
     super(name, location, location, guidedTourAvailable);
     this.establishedYear = establishedYear;
 }

 @Override
 public void displayActivityDetails() {
     System.out.println("Historic Site: " + getName());
     System.out.println("Location: " + getLocation());
     System.out.println("Established Year: " + establishedYear);
     System.out.println();
 }
}
