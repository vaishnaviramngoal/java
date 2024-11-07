public class VehicleRunner {
    public static void main(String[] args) {
        Bike bike = new Bike("Honda", "Black", 65);
        System.out.println("Bike Information");
        bike.displayInfo();          
        System.out.println("--------------");

        Car car = new Car("Ford", "White", "Diesel");
        System.out.println("Car Information");
        car.displayInfo();        
        car.fuelType();     
        System.out.println("------------");

        Truck truck = new Truck("Chevrolet Silverado", "Red", 1500);
        System.out.println("Truck Information");
        truck.displayInfo();
        truck.move();          
        System.out.println("-------------");
    }
}
