package CGPrograms;

import java.util.*;

public class numspelling {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m; // Declare m outside the loop
		do {
			System.out.println("Enter a number between 1 and 10:");
			int n = sc.nextInt();
			switch (n) {
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
				case 10:
					System.out.println("Ten");
					break;
				default:
					System.out.println("Please enter a number between 1 and 10.");
			}
			System.out.println("If you want to enter another number, press 1. Otherwise, press any other key:");
			m = sc.nextInt();
		} while (m == 1);
		sc.close(); 
	}
}
