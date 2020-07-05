package basicprograms.programs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader reader =
        new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the desired string: ");
		String name = reader.readLine();
        System.out.println(name);
        
        String reverse = "";
      String[] a = name.split("");
      for (int i=0; i<a.length; i++)
      {
    	  System.out.println(a[i]);
      }
      
      for (int j=a.length-1; j>=0; j--)
      {
    	  reverse = reverse + a[j];
    	  
      }
      
      System.out.println("the reverse string is: " + reverse);
      
      if (reverse.equals(name))
      {
    	  System.out.println(name + " is a palindrome.");
      }
      else 
      {
    	  System.out.println("Not palindrome");
      }
	}

}
