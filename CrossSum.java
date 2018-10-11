package hjemmeopgave1;
import java.util.Scanner;
public class CrossSum {

	//this method takes an input from the user and
	//complains if it isn't a positive integer
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		if(scanner.hasNextInt()) {
			n = scanner.nextInt();
		}
		if(n <= 0) {
			System.out.println("input must be positive integer");
		}
		else {
		System.out.println(crossSum(n));
		System.out.print(reducedCrossSum(n));
		}
		scanner.close();
    }
	
	//This method calculates the cross sum by using a while-loop.
	//The first run-through of the loop finds the last digit of n (by using modulo 10) and adds it
	//to the cumulative sum cSum. n is then divided by 10 (integer division) so that the next run-through
	//will find the next digit of n and so forth. Once n reaches 0, cSum will be the sum of all the digits of n.
	public static int crossSum(int n) {
		int cSum = 0;
		while (n > 0) {
			cSum = cSum + n % 10;
			n = n / 10;
		}
		return cSum;
	}
	
	//This method finds the cross sum of n by calling crossSum.
	//If the cross sum consists of at least two digits, the method then calls itself
	// with the cross sum as the new input. This recursion continues until the c-sum is reduced to a single digit.
	public static int reducedCrossSum(int n) {
		int cSum = crossSum(n);
        
        if (cSum > 9) {
            return	reducedCrossSum(cSum);
        }
        else {
            return cSum;
        }
	}
}
