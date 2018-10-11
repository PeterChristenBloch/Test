package hjemmeopgave1;
import java.util.Scanner;
public class  op2a{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		checkString(input);
		scanner.close();
	}
    //This method checks for length > 6 and uses a for-loop to check each character in the string
	//for the properties we want
	public static void checkString(String input) {
	    
	    char currentCharacter;
	    boolean number = false;
	    boolean upperCase = false;
	    boolean lowerCase = false;
	    boolean specialCharacter = false;
	    boolean length = false;
	    
	    if (input.length() > 6) {
	    	length = true; 
	    }
	    for (int i = 0; i < input.length(); i++) {
	        currentCharacter = input.charAt(i);
	        if (Character.isDigit(currentCharacter)) {
	            number = true;
	        } 
	        else if (Character.isUpperCase(currentCharacter)) {
	            upperCase = true;
	        } 
	        else if (Character.isLowerCase(currentCharacter)) {
	            lowerCase = true;
	        } 
	        else if (!Character.isLetterOrDigit((currentCharacter))) {
	            specialCharacter = true;
	        }
	    }
	    if (number && upperCase && lowerCase && specialCharacter && length) {
	    	System.out.print("true"); }
	        
	    else {
	    	System.out.print("false");}
	    
	}
}     
