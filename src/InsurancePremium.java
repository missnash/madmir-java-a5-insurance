import java.util.Scanner;

public class InsurancePremium {

	public static void main(String[] args) {
		
		//Declare variables and scanner 
		int currentYr, birthYr, prem;
		Scanner sc = new Scanner(System.in);
		
		//Display input
		System.out.print("Please enter the current year: ");
		currentYr = sc.nextInt();
		System.out.print("Please enter your birth year: ");
		birthYr = sc.nextInt();
		prem= calculatePremium(currentYr, birthYr);
		
		//Display Output
		System.out.print("Your premium would be " + prem);
		
		
	}
	
	//Premium Calculation 
	public static int calculatePremium(int cy, int by) {
		int age = cy - by;
		int dec = age / 10;
		int premium = (dec + 15) * 20;
		return premium; 
	}

}
