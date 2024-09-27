public class methods{
   public static void main (String args[]){

   WelcomeMessage();
   int sum = addNumbers();
   computer();
   System.out.println("the maximum elemnet is:"+findMax(10,20,30));
   session();
   int fact = factorial(5);
   System.out.println("Factorial of 5: " + fact);
   String reversed = reverseString("Java");
   System.out.println("Reversed string: " + reversed);
   int squareOfNumber = square(4);
   System.out.println("Square of 4: " + squareOfNumber);
   int maxNumber = max(10, 5);
   System.out.println("Maximum: " + maxNumber);
   boolean isEvenNumber = isEven(10);
   System.out.println("Is 10 even? " + isEvenNumber);
   
}
    public static void WelcomeMessage() {
    System.out.println("Welcome to the Java program!");
    }

    public static int addNumbers() {
     int a=10;
     int b=20;
     int sum = a+b;
     System.out.println("The result is: " + sum);
     return sum;
     }
    public static void computer() {
    System.out.println("computer shows the error message");
    }
    public static int findMax(int a,int b,int c){
    if(a>b  && a>c){
      return a;
     }
     else if(b>a && b>c){
       return b;
     }
     else {
       return c;
     }
     }
     public static void session() {
        double length = 5.0;
        double width = 3.0;
        double result = calculateRectangleArea(length, width);

     System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + result);
    }
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
     public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static int square(int number) {
        return number * number;
    }
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
     public static boolean isEven(int number) {
        return number % 2 == 0;
    }


}

