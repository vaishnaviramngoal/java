import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	            try {
		            
		            Class.forName("com.none.ClassName");
		        } catch (ClassNotFoundException e) {
		            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
		        }

		        
		        try {
		            
		            FileReader reader = new FileReader("none.txt");
		        } catch (IOException e) {
		            System.out.println("Caught IOException: " + e.getMessage());
		        }
	}

}
