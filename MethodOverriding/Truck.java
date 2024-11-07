public class Truck extends Vehicle {

    int payloadCapacity;

    public Truck(String model, String color, int payloadCapacity) {
        super("Truck", model, color);  
        this.payloadCapacity = payloadCapacity;
    }

    public void move() {  
        System.out.println("Vehicle is moving");
    }

    public void fuelType(String fuelType) {  
        System.out.println("Truck fuelType: " + fuelType);
    }
}
