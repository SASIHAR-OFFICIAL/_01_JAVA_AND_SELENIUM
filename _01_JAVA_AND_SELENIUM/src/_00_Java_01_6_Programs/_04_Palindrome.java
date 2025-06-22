package _00_Java_01_6_Programs;

import java.util.Scanner;

public class _04_Palindrome {
	public static void main(String[] args) {
		
//		Input: madam      => Output: ✅ It's a palindrome!
//		Input: Hello      => Output: ❌ It's not a palindrome.
//		Input: 121        => Output: ✅ It's a palindrome!
      
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove spaces if needed
        input = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("✅ It's a palindrome!");
        } else {
            System.out.println("❌ It's not a palindrome.");
        }

        sc.close();
    }
}