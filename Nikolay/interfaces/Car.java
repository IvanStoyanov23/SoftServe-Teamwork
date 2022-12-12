

package org.vtu.Lab4;


public class Car extends AbstractVehicle{
    private int numPassengers;

    public Car(String name, String color, int wheels, int numPassengers) {
        super(name, color, wheels);
        this.numPassengers = numPassengers;
    }
    
    @Override
    public void drive() {
        System.out.println("Driving a Car.");
    }

    /**
     * @return the numPassengers
     */
    public int getNumPassengers() {
        return numPassengers;
    }

    /**
     * @param numPassengers the numPassengers to set
     */
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    
}
