public class Car {

         static String manufacturer = "Toyota";
         static int totalCarsProduced = 100000;
         static String fuelType = "Gasoline";
         String model;
         String color;
         int year;
         int mileage;

         static {

          manufacturer = "Toyota";
          totalCarsProduced = 100000;
          fuelType = "Gasoline";
          }

           public Car(String model, String color, int year, int mileage) {
              this.model = model;
              this.color = color;
               this.year = year;
                this.mileage = mileage;
           }

          

          public void printCarInfo() {

          System.out.println("manufacturer: " +manufacturer);
          System.out.println("totalCarsProduced : " +totalCarsProduced );
          System.out.println("fuelType: " +fuelType);
          System.out.println("model: " +model);
          System.out.println("color: " +color);
          System.out.println("year: " +year);
          System.out.println("mileage: " +mileage);
          }
}