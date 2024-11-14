package com.xworkz.Abstraction;

public class Bike extends Vehicle {
          @override
         public void start_engine() {
           System.out.println("Engine started");
         }
          @override
          public void accelerate() {
           System.out.println("bike has to start");
           }
           @override
         public void break() {
            System.out.print(" bike has to stop");
          }

}