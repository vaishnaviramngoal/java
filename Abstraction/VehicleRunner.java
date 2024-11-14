package com.xworkz.Abstraction;

public class VehicleRunner {
       public static void main(String[] args) {
           Vehicle bike = new Bike();
           Vehicle car = new Car();
           vehicle truck = new Truck();

           System.out.println("----Bike -------");
            bike.displayFuelLevel();
            bike.start_engine();
            bike.accelerate();
            bike.break();

           System.out.println("----Car -------");
            car.displayFuelLevel();
            car.start_engine();
            car.accelerate();
            car.break();

          System.out.println("----Truck -------");
            truck.displayFuelLevel();
            truck.start_engine();
            truck.accelerate();
            truck.break();
         }
}



        