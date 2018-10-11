package hjemmeopgave1;
import java.util.Scanner;

public class op2c {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String email = scanner.nextLine();
		System.out.println(checkEmail(email));
		scanner.close();
    }
    public static boolean checkEmail(String email) {
    	//Verifying that there is exactly one @ in the input string using the helper method counterOf(string, char) which
    	// how many times a specific char appears in a string.
        
        
        if (counterOf(email, '@') != 1) {
        	return false;
        }
        //the input string is split at the "@". The part before the @ is called
        //userName and the part after is called domainName.
        
        String userName = email.substring(0, email.indexOf('@'));
        String domainName = email.substring(email.indexOf('@')+1, email.length());
        
        //Checking to see if userName is empty, whether domainName contains
        //at least one period and whether the domain name begins or end with a period
        
        if(userName.length() < 1 || counterOf(domainName, '.') == 0 || domainName.startsWith(".") || domainName.endsWith(".")) {
        	return false;
        }
        return true;
    }
    public static int counterOf(String email, char c) {
    	int countOf = 0;
    	for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)==c)
                countOf++;
        }
    	return countOf;
    }
}
    	
    	
    	