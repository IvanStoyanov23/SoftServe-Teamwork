
package org.vtu.Lab4;
public abstract class AbstractVehicle implements VehicleInterface{

    private String name;
    private String color;
    private int wheels;

    public AbstractVehicle(String name, String color, int wheels) {
        this.name = name;
        this.color = color;
        this.wheels = wheels;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String aname) {

        this.name = aname;

    }

    public String getColor() {

        return color;

    }

    public void setColor(String acolor) {

        this.color = acolor;

    }

    public int getWheels() {

        return wheels;

    }

    public void setWheels(int awheels) {

        this.wheels = awheels;

    }
}
