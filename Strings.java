public class Strings {
  
     public static void main(String args[]) {


        String firstName = "Vaishnavi";
        String firstName1 = "Amrutha";
        String firstName2 = "Vaishnavi";
        String firstName3 = "Pooja";
        firstName2 = "neeta";

        String firstName5 = new String("George");
        String firstName6 = new String("James");
        String firstName7 = new String("Jhony");
        String firstName8 = new String("Mary");
        String firstName9 = new String("Bumrah");
        
        String lastName = "amngoal";
        String lastName1 = "patgar";
        String lastName2= "amngoal";
        String lastName3 = "hegde";
        String lastName4= "bhatt";

        
        String lastName5 = new String("deshpande");
        String lastName6 = new String("patgar");
        String lastName7 = new String("gosling");
        String lastName8 = new String("modaliyar");
        String lastName9 = new String("Reddy");
        
        
        System.out.println(firstName2);
        System.out.println(firstName.equals(firstName2));
        System.out.println(lastName.equals(lastName2));

        char[] charArray = lastName4.toCharArray();
        String value = "";
        for( int i=charArray.length-1;i>=0;i--){
         value = value + charArray[i];
         }
        System.out.println(value);

         char[] charArray1 = firstName.toCharArray();
         String value1 = "";
         for(int i=charArray1.length-1;i>=0;i--){
         value1 = value1 + charArray1[i];
         }
         System.out.println(value1);

        }
 
        
        

}