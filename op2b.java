package hjemmeopgave1;

import java.util.Scanner;

public class op2b {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		checkPhone(input);
		scanner.close();
    }
	
	//This method scrubs all whitespaces from the input string and
	//removes the +45 prefix if present. It then checks to see if
	//the string consists of exactly eight numbers.
    public static void checkPhone(String input) {
        input = input.replace(" ","");
        
        if(input.startsWith("+45")) {
            input = input.substring(3);
        }
        if (input.length() == 8 && !input.startsWith("0") && isNumeric(input)) { 
            System.out.print("true");   
        }else {
        	System.out.print("false");}
    
        }
    
        // this method uses a loop to check whether each character in
        // the string is a digit
        public static boolean isNumeric(String input) {
            boolean allNumbers = true;
        	char currentCharacter;
        	for (int i = 0; i < input.length(); i++) {
    	        currentCharacter = input.charAt(i);
    	        if (!Character.isDigit(currentCharacter)) {
    	            allNumbers = false;
                }
        	}  
        	
        	if(allNumbers) {
        	   return true;
            }
           else {
        	   return false;
           }
        }
}
