public class Payment{

   int PaymentId ;
   long Amount;
   String status;
   String PaymentMethod ;

   public Payment() {
          System.out.println("no parameterized constructor ");
    }

    public Payment(int PaymentId, long Amount, String status, String PaymentMethod) {
    this.PaymentId = PaymentId;
    this.Amount = Amount;
    this.status = status;
    this.PaymentMethod = PaymentMethod ;
    }

   public static void cancelPayment() {
    
    }

   public static void refundPayment() {
   
    }

   public static void completePayment() {

    }

     public void PaymentInfo() {
     System.out.println("Payment Id : "+ PaymentId);
     System.out.println("Amount : " +Amount);
     System.out.println("status : " +status);
     System.out.println("paymentmethod : " +PaymentMethod);
    }
}
 