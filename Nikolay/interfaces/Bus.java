

package org.vtu.Lab4;

public class Bus extends AbstractVehicle{
    private int numPassengers;

    public Bus(String name, String color, int wheels, int numPassengers) {
        super(name, color, wheels);
        this.numPassengers = numPassengers;
    }
    @Override
    public void drive() {
        System.out.println("Driving a Bus.");
    }
    
}
