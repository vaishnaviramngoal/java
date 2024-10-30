public class VehicleRunner {
    public static void main(String[] args) {
        // Truck instance
        Truck truck = new Truck();
        truck.isFourWheelDrive = true;
        truck.model = "Silverado";
        truck.color = "Red";
        truck.brand = "Chevrolet";
        truck.payloadCapacity = 100;
        
        System.out.println("Brand: " + truck.brand);
        System.out.println("Model: " + truck.model);
        System.out.println("Color: " + truck.color);
        System.out.println("Is Four Wheel Drive: " + truck.isFourWheelDrive);
        System.out.println("Payload Capacity: " + truck.payloadCapacity);
        
        truck.accelerate();
        
        // Car instance
        Car car = new Car();
        car.model = "Silverado";
        car.color = "White";
        car.brand = "Ford";
        car.noOfdoors = 4;
        car.fuelType = "Diesel";
        car.engineSize = 2;
        
        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.model);
        System.out.println("Color: " + car.color);
        System.out.println("Number of Doors: " + car.noOfdoors);
        System.out.println("Fuel Type: " + car.fuelType);
        System.out.println("Engine Size: " + car.engineSize);
        
        car.toDrive();
        
        // Bike instance
        Bike bike = new Bike();
        bike.model = "Splendar";
        bike.color = "Black";
        bike.brand = "Honda";
        bike.speed = 60;
        bike.mileage = 40;
        bike.isElectric = false;
        
        System.out.println("Brand: " + bike.brand);
        System.out.println("Model: " + bike.model);
        System.out.println("Color: " + bike.color);
        System.out.println("Speed: " + bike.speed);
        System.out.println("Mileage: " + bike.mileage);
        System.out.println("Is Electric: " + bike.isElectric);
        
        bike.ride();
    }
}
