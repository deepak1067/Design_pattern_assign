package com.knoldus.Interface_Segration;

//Segregation means keeping things separated, and the Interface Segregation Principle is about separating the interfaces.

public interface ParkingLot {
    void parkBus();	// Decrease empty spot count by 1
    void unparkBus(); // Increase empty spots by 1
    void getCapacity();	// Returns car capacity
}

interface PaidParkingLot extends ParkingLot{
    double calculateFee(Bus bus, int hour); // Returns the price based on number of hours
    void doPayment(Bus bus);
}
interface FreeParkingLot extends ParkingLot{

}

class FreePark implements FreeParkingLot{

    @Override
    public void parkBus() {
        System.out.println("Bus is parked");
    }

    @Override
    public void unparkBus() {
        System.out.println("Bus is unparked");
    }

    @Override
    public void getCapacity() {
        System.out.println("Capcity: ");
    }
}

class Bus implements PaidParkingLot{

    @Override
    public void parkBus() {
        System.out.println("Bus is parked");
    }

    @Override
    public void unparkBus() {
        System.out.println("Bus is unparked");
    }

    @Override
    public void getCapacity() {
        System.out.println("Capcity: ");
    }

    @Override
    public double calculateFee(Bus bus, int hour) {
        double pricePerHour = 10;
        double totalFee = pricePerHour * hour;
        return totalFee;
    }

    @Override
    public void doPayment(Bus bus) {
        System.out.println("Payment is initiated");
    }
}

class TestISP{

    static  void testPaid(Bus bus)
    {
        bus.parkBus();
        bus.getCapacity();
        bus.doPayment(bus);
        bus.unparkBus();
       System.out.println(bus.calculateFee(bus,14));
    }
    static  void testFree(FreePark freePark){
        freePark.parkBus();
        freePark.getCapacity();
        freePark.unparkBus();
    }
    public static void main(String[] args)
    {
        Bus bus=new Bus();
        testPaid(bus);

        testFree(new FreePark());
    }

}
