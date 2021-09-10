package Liskov_Substitution_principle;

//Liskov Substitution is: Objects of super class shall be replaced with objects of subclass.

class Vehicle {
    public void start(){
        System.out.println("Starting a vehicle");
    }

    public void stop(){
        System.out.println("Stopping a vehicle");
    }
}

class Bus extends Vehicle{
    public void start(){
        System.out.println("Starting a bus");
    }

    public void stop(){
        System.out.println("Stopping a bus");
    }
}

class Train extends Vehicle{
    public void start(){
        System.out.println("Starting a train");
    }

    public void stop(){
        System.out.println("Stopping a train");
    }
}


public class Liskov_Substitution {

    static  void testDrive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }

    public static void main(String[] args) {
        testDrive(new Vehicle());
        testDrive(new Bus());
        testDrive(new Train());
    }
}
