

package org.vtu.Lab4;


public class Truck extends AbstractVehicle{
    private double load;

    public Truck(String name, String color, int wheels, double load) {
        super(name, color, wheels);
        this.load = load;
    }
    @Override
    public void drive() {
        System.out.println("Driving a Truck.");
    }
    
}
