public class Overloading {

   public static void main(String[] args){
    
      display(10);
      display("vaishnavi", 156789);  
      display(35.00, 24354858);
      getMeAPen(25);
      getMeAPen("Butterflow",25);
      getMeApen("ballpoint",5.5f);
      playmusic(12);
      playmusic("Melody songs" , 4);
      playmusic('s', "Kannada lang"); 
      System.out.println("Multiplication of  arguments:"+Mul(3*5*7*2*3));

     
    }
     
   public static void display(int a){
        System.out.println("displaying method :"  +a);
    }
   public static void display(String Name ,int Number){
      System.out.println("Number "+ Number+ " displaying name:" + Name);
    }
   public static void display( double n1,long n2) {
      System.out.println("n1: " + 35.00+ ", n2: " + 6547323);
    }
   public static void getMeAPen(int cost){
     System.out.println("The cost of pen is :" +cost);
      }
    public static void getMeAPen(String Name,int cost){
     System.out.println("The pen name: " + Name+ " cost:" + cost);
     }
    public static void getMeApen(String Name ,float Number ){
    System.out.println("Number " +Number+ "Name:" +Name );
    }
    public static void playmusic(int ContentId){
     System.out.println("The ContentId  is :" +ContentId);
    }
     public static void playmusic(String Name, int Number){
        System.out.println("Number: " + Number+ " The music name:" + Name);
     }
    public static void playmusic(char Name, String songType){
    System.out.println("The swara starts with : "+Name+ " songType:" + songType);
   } 
    public static int Mul(int... numbers){
       int result=0 ;     
        for(int i=0; i<numbers.length;i++){
      result += numbers[i];
       }
        return result;
     }
 }


