package com.xworkz.Abstraction;

public class Car extends Vehicle {
       @override
      public void start_engine() {
        System.out.println("Engine started");
      }
         @override
       public void accelerate() {
        System.out.println("Car has to start");
        }
          @override
         public void break() {
            System.out.print(" Car has to stop");
          }

}