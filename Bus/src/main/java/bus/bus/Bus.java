/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bus.bus;

/**
 *
 * @author paulh
 */
public class Bus {
  
    public Driver driver;
    public Engine engine;

    Bus(Driver driver){
        this.driver = driver;
        this.engine = new Engine("Diesel");
    }

    public String engineIdentity(){
        return engine.identity();
    }

    public static void main(String[] args){

        Driver driver = new Driver(10);

        Passenger passenger = new Passenger("Student");

        Bus bus = new Bus(driver);

        String output =
                driver.identity() + "\n" +
                passenger.identity() + "\n" +
                bus.engine.identity(); 

        System.out.println(output);
    }
}
