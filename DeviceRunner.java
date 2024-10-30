public class DeviceRunner {

         public static void main(String[] args) {
              Laptop device = new Laptop();

                device.brand = "DELL";
                device.model=  "MacBook Pro";
                device.deviceType= "laptop";
                device.screenSize = 13.3f;
                device.storagecapacity = 512;
                device.camerapixels = 12;
                device.proccessor ="Intel Core i7";
                device.os="Windows 10";
                device.RAM = 16;

               System.out.println("brand name:" +device.brand);
               System.out.println("model:" +device.model);
               System.out.println("deviceType:" +device.deviceType);
               System.out.println("screensize:" +device.screenSize);
               System.out.println("camerapixels:" +device.camerapixels);
               System.out.println("storagecapacity:" +device.storagecapacity);
               System.out.println("Proccessor:" +device.proccessor);
               System.out.println("OS:" +device.os);
               System.out.println("RAM:" +device.RAM);

           }
}

 
               