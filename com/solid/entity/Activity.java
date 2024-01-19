package com.solid.entity;

abstract class Activity extends ThingToDo {
    private int durationInMinutes;

    public Activity(String name, String location, int durationInMinutes) {
        super(name, location);
        this.durationInMinutes = durationInMinutes;
    }

    // Additional methods for accessing attributes (getters and setters) can be added here

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
