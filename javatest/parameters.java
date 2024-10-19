class Email{
       
    public void sendEmail(String emailId, String subject) {
        System.out.println("Sending email to: " + emailId);
        System.out.println("Subject: " + subject);
    }

        
        public class parameters {
        public static void main(String[] args) {
        
        Email email = new Email();
        email.sendEmail("vaishnaviamngoal@.com", "Meeting");
       }
      }
     
}

           