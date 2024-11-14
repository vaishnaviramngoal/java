package com.xworkz.Abstraction;

public class Truck extends Vehicle { 
       @override
       public void start_engine() {
        System.out.println("Engine started");
          }

         @override
        public void accelerate() {
        System.out.println("Truck has to start");
        }

        @override 
        public void break() {
            System.out.print(" Truck has to stop");
          }

}