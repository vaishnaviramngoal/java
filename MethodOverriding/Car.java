public class Car extends Vehicle {
              String fuelType;

         public Car(String model, String color, String fuelType) {
            super("Car",model,color);
             this.fuelType = fuelType;
          }

         
         public void tomove() {
           System.out.println("vehicle is moving");
          }
            
          public void fuelType() {
            System.out.println("Car fuelType :" +fuelType);
           }
}
           


            
 