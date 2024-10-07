public class Table
{
  public static void main(String[] args) 
   {
      int arr[] = {10,20,30,40,50,60,70,80,90,100};
       for (int i=0; i<10; i++){
      System.out.println(arr[i]);
      }
       for(int i=9; i>=0;i--) {
       System.out.println(arr[i]);
       }
        for(int i=0; i<10; i=i+2){
        System.out.println(arr[i]);
        }
      char[] charArray={'A','B','C','D','E','F','G','H','I','J'};
      for(int i=0;i<10;i++){
       System.out.println(charArray[i]);
       }
       for (int i= 9; i>0; i--){
       System.out.println(charArray[i]);
        }
       for(int i=0; i<=9; i=i+2){
        System.out.println(charArray[i]);
        }
       
       boolean[] booleanArray={true,false,true,false,true,false,true,false,true,false};
       for(int i=0; i<10;i++){																		
       System.out.println(booleanArray[i]);
        }
       for (int i=9;i>0; i--) {
       System.out.println(booleanArray[i]);
       }
        for(int i=0; i<10; i=i+2){
        System.out.println(booleanArray[i]);
        }
     
       short [] svalue ={21,75,23,56,84,85,48,48,39,93,90};
          for (int i=0; i<=10; i++){
        System.out.println(svalue[i]);
        }
         for(int i=9; i>0; i--){
         System.out.println(svalue[i]);
         }
       float height[] ={5.5f,4.5f,2.4f,6.4f,3.9f,6.8f,5.1f,6.2f,5.5f,5.4f};
        for(int i=0; i<10; i=i+2){
        System.out.println(height[i]);
        }
        for(int i=9; i>0; i--){
         System.out.println(height[i]);
         }
        for(int i=0; i<10; i++){
        System.out.println(height[i]);
       }
     double dvalue[]={2.555,4.557,2.111,3.666,3.667,6.778,4.449,3.999};
        for(int i=0; i<7; i++) {
       System.out.println(dvalue[i]);
     }
        for(int i=3; i<=7; i++) {
        System.out.println(dvalue[i]);
    }
     byte arr1[]={-128,-100,0,50,127};
     for(int i=2;i>=0; i--){
     System.out.println(arr1[i]);
     }
     long arr2[]={320000,2055000,450000,600000,7444000,664400,664499,228899};
      for(int i=0; i<8; i++) {
      System.out.println(arr2[i]);
      }
      
 }
    
}