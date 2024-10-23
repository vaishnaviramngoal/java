public class StringMethodexample {


            public static void main(String[] args) {

           
            System.out.println("Concatenate String");
            String lastName = " amngoal";
            String firstName = "vaishnavi";
            String fullName = lastName.concat(firstName);
            System.out.println(fullName);

             
           System.out.println("String to uppercase");
           String msg = "mary had a little lamb";
           String messageUpper = msg.toUpperCase();
           System.out.println(messageUpper);

           System.out.println("String to lowercase");
           String gadgets = "SAMSUNG GALAXY ";
           String nameLower = gadgets.toLowerCase();
           System.out.println(nameLower);

           System.out.println("String Trim method");
           String language = "           java programing  ";
           String valueTrim = language.trim();
           System.out.println(valueTrim);

         
           System.out.println("Split String ");
           String greetingmsg = "Happy Holidays ";
           String[] messageSplit  = greetingmsg.split(" ");
           System.out.println(messageSplit[0]);
           System.out.println(messageSplit[1]);

           System.out.println("String empty or not ");
           String result= "";
           boolean resultempty =result.isEmpty();
           System.out.println(resultempty);
           


           System.out.println(" Palindrome") ;
           String val = " language";
           String reversedValue= "";
           
           char[] valArray= val.toCharArray();
            for(int i=valArray.length-1; i>=0; i--) {
                 reversedValue = reversedValue+valArray[i];
             }
             
              if(val.equals(reversedValue)) {
                 System.out.println("is a palindrome");
                }
              else{
                     System.out.println("is not a palindrome");
                }

                System.out.println("second smallest number");
                  int[] arr = { 23,45,76,67,84,3,4,8,18};
                  int smallValue = secondSmallestValue(arr);
                     System.out.println(smallValue);
                  }

                   public static int secondSmallestValue(int arr[]) {
                     int  smallValue = arr[0];
                     int secondSmallestValue = arr[0];
                     for(int i=1; i<arr.length; i++) {
                       if(arr[i]<smallValue) {
                           secondSmallestValue = smallValue;
                                smallValue= arr[i];
                       }
                       else if(arr[i] < secondSmallestValue) {
                                     secondSmallestValue=arr[i];
                         }
                      }
                       return secondSmallestValue;
         }
}



           
            