public class Bike extends Vehicle {
            int speed;

        public Bike(String model, String color, int speed) {
            super("Bike",model,color);
             this.speed = speed;
         }

         
          public void tomove() {
           System.out.println("vehicle is moving");
          }

          public void toaccelerate(int increaseBy) {
             speed += increaseBy;
            System.out.println("The vehicle accelerates. New speed: " + speed + " km/h");
           }
}