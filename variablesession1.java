public class variablesession1 {

    public static void main(String[] args) {
       
        byte b1 = 10;   
        byte b2 = 20;   
        
       
        byte bSum = (byte) (b1 + b2);  
        byte bDifference = (byte) (b1 - b2); 
        byte bProduct = (byte) (b1 * b2);
        byte bQuotient = (byte) (b2 / b1);
        
        System.out.println("Byte Example:");
        System.out.println("Byte 1: " + b1);
        System.out.println("Byte 2: " + b2);
        System.out.println("Sum of Byte 1 and Byte 2: " + bSum);
        System.out.println("Difference of Byte 1 and Byte 2: " + bDifference);
        System.out.println("Product of Byte 1 and Byte 2: " + bProduct);
        System.out.println("Quotient of Byte 2 and Byte 1: " + bQuotient);

        
        short s1 = 1500;   
        short s2 = 3000;  
        
        
        short sSum = (short) (s1 + s2);  
        short sDifference = (short) (s1 - s2);
        short sProduct = (short) (s1 * s2);
        short sQuotient = (short) (s2 / s1);
        
        System.out.println("\nShort Example:");
        System.out.println("Short 1: " + s1);
        System.out.println("Short 2: " + s2);
        System.out.println("Sum of Short 1 and Short 2: " + sSum);
        System.out.println("Difference of Short 1 and Short 2: " + sDifference);
        System.out.println("Product of Short 1 and Short 2: " + sProduct);
        System.out.println("Quotient of Short 2 and Short 1: " + sQuotient);
    }
}
