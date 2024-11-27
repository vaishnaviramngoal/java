import java.io.FileInputStream;
import java.io.IOException;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	        FileInputStream inputStream = new FileInputStream("aspdf");
	        Class.forName("java.lang.Integer");
	     }

	     catch(IOException e) {
	    	 e.printStackTrace();
	     }

	     catch(ClassNotFoundException e) {
	       System.out.println("Class Not Found Exception");
	        
	     }	
		

	}

}
