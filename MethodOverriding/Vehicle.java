public class Vehicle {

       String brand;
       String model;
       String color;

       public Vehicle(String brand, String model, String color) {
         this. brand = brand;
         this.model = model;
         this. color = color;
        }

        public void tomove() {
           System.out.println("vehicle is moving");
        }
        public void displayInfo(){
        System.out.println("brandName:" +brand);
        System.out.println("modelName:" +model);
        System.out.println("color :" +color);
        }
}
         

    