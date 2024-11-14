public class TypeCasting {
    public static void main(String[] args) {
        
       //Upcasting 
        int marks = 100;
        long longValue = marks; 
        System.out.println("Upcasting int to long: " + longValue);

        
        byte age = 20;
        int intFromByte = age; 
        System.out.println("Upcasting byte to int: " + intFromByte);

        
        short testScore = 25;
        double doubleFromShort = testScore; 
        System.out.println("Upcasting short to double: " + doubleFromShort);

        
        float percentage = 84.5f;
        double doubleFromFloat = percentage; 
        System.out.println("Upcasting float to double: " + doubleFromFloat);

        
        // Downcasting
        
        double temprature = 9.78;
        int intFromDouble = (int) temprature; 
        System.out.println("Downcasting double to int: " + intFromDouble);

        
        long phno = 475684933;
        short shortFromLong = (short) phno; 
        System.out.println("Downcasting long to short: " + shortFromLong);

        
        int year = 2024;
        byte byteFromInt = (byte) year; 
        System.out.println("Downcasting int to byte: " + byteFromInt);

       
        float height = 5.7f;
        int intFromFloat = (int) height; 
        System.out.println("Downcasting float to int: " + intFromFloat);
       
    }
}
