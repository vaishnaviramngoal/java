public class PaymentProcess{

  public static  void main(String[] args) {

     Payment payment = new Payment();
     payment.PaymentId = 1;
     payment.Amount = 1000;
     payment.status = "pending";
     payment.PaymentMethod = "CreditCard";
    
     System.out.println("PaymentId of the endusers :" +payment.PaymentId);
     System.out.println("Displayes Amount :" +payment.Amount);
     System.out.println("payment status  :" +payment.status);
     System.out.println("which payment method :" +payment.PaymentMethod);
     System.out.println("------------------------------------------------");

     Payment payment1 = new Payment();
     payment1.PaymentId = 2;
     payment1.Amount = 5000;
     payment1.status = "completed";
     payment1.PaymentMethod = "paypal";

     
     System.out.println("PaymentId of the endusers :" +payment1.PaymentId);
     System.out.println("Displayes Amount :" +payment1.Amount);
     System.out.println("payment status  :" +payment1.status);
     System.out.println("which payment method :" +payment1.PaymentMethod);
     System.out.println("------------------------------------------------");
   

     Payment payment2 = new Payment();
     payment2.PaymentId = 3;
     payment2.Amount = 8000;
     payment2.status = "failed";
     payment2.PaymentMethod = "Bank Transfer";
   
     System.out.println("PaymentId of the endusers :" +payment2.PaymentId);
     System.out.println("Displayes Amount :" +payment2.Amount);
     System.out.println("payment status  :" +payment2.status);
     System.out.println("which payment method :" +payment2.PaymentMethod);
     System.out.println("------------------------------------------------");

     Payment payment3 = new Payment(4, 15000, "completed", "GPay"); 
     Payment payment4 = new Payment(5, 20000, "failed", "PhonePay"); 
     Payment payment5 = new Payment(6, 25000, "pending", "AmazonPay"); 
     Payment payment6 = new Payment(7, 30000, "failed", "Paytm"); 
     Payment payment7 = new Payment(8, 35000, "completed", "digital wallets");
     Payment payment8 = new Payment(9, 40000, "pending", "cash on delivery");
     Payment payment9 = new Payment(10, 45000, "failed", "ApplePay"); 

     payment3.PaymentInfo();
     payment4.PaymentInfo();
     payment5.PaymentInfo();
     payment6.PaymentInfo();
     payment7.PaymentInfo();
     payment8.PaymentInfo();
     payment9.PaymentInfo();     

    }
}
