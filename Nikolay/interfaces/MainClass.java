

package org.vtu.Lab4;


public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
       driveTest();
    }        
    static void driveTest(){
        VehicleInterface[] vehicles = new VehicleInterface[3];
        vehicles[0]= new Car("Opel", "Red", 4, 5);
        vehicles[1] = new Truck("Opel", "Red", 4, 2.5);
        vehicles[2] = new Bus("Opel", "Red", 6, 40);
        driveVehicles(vehicles);
    }
    private static void driveVehicles(VehicleInterface[] vehicles){
        for( VehicleInterface vehicle:vehicles){
            vehicle.drive();
        }
    }
}
