package com.xworkz.Abstraction;

public abstract class Vehicle {

      public abstract void start_engine();
      public abstract void accelerate();
      public abstract void break();

        public void displayFuelLevel() {
         System.out.println("Current fuel level");
        }
}
