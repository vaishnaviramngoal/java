public class ReturnType {
  
    public static int add (int a, int b) {
      
       return a+b;
      }
     public double difference(double a, double b) {
        return a - b;
    }
     public String concatenate(String str1, String str2) {
        return str1 + str2;
      }
     public boolean isEven(int num) {
        return num % 2 == 0;
    }
    public String reverse(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        return reversedStr.reverse().toString();
     }
   
     public long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
      public String Reverse(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        return reversedStr.reverse().toString();
        }
       public double calculateArea(double radius) {
         double Radius = 5.5;
        return Math.PI * radius * radius;
        }
       public int max(int a, int b) {
        return a > b ? a : b;
        }
     
        public static void main(String[] args) {
        ReturnType obj = new ReturnType();

       System.out.println("Add: " + obj.add(10,15));
        System.out.println("Difference: " + obj.difference(5.5, 3.2));
        System.out.println("Concatenation: " + obj.concatenate("Hello", " World"));
        System.out.println("Is Even: " + obj.isEven(4));
        System.out.println("Factorial: " + obj.factorial(5));
        System.out.println("Reverse: " + obj.reverse("Java"));
        System.out.println("calculateArea: " +obj.calculateArea(5.5));
         System.out.println("Max: " + obj.max(10, 20));
        
    }
   

}
    
