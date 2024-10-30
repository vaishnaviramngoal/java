public class ApplianceRunner {

        public static void main(String[] args) {
    
                 WashingMachine washingMachine = new WashingMachine();
                  washingMachine.brandname= "LG";
                  washingMachine.powerconsumption = 1000;
                  washingMachine.appliance_type = "machine";
                  washingMachine.loadCapacity = 1500;
                  washingMachine.model = "EcoBubble";


                  washingMachine.loadCapacity();
                 
              System.out.println("name:"+washingMachine.brandname);
              System.out.println("power:"+washingMachine.powerconsumption+ "watt");
              System.out.println("type :" +washingMachine.appliance_type);
              System.out.println("load :" +washingMachine.loadCapacity+ "kg");
              System.out.println("model :" +washingMachine.model);
            }
}

      
                

               