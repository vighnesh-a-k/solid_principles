package com.solid.entity;

abstract class ThingToDo {
    private String name;
    private String location;

    public ThingToDo(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	// Abstract method to display activity details
    public abstract void displayActivityDetails();
}
