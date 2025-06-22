package _00_Java_01_6_Programs;

import java.util.Scanner;

public class _07_Armstrong_Number {

	public static void main(String[] args) {
//		A number of n-digits can be defined as an Armstrong number if and only if 
//		the sum of its digits powered to n is equal to the number itself. For example, 
//		1634 is an Armstrong number as
//		153,13+53+33 is equal to 153153.
//		1634=14+64+34+441634=14+64+34+44
//		153 → 13+53+33=1+125+27=15313+53+33=1+125+27= 153
//
//		370 → 33+73+03=27+343+0=37033+73+03=27+343+0= 370
//
//		371 → 33+73+13=27+343+1=37133+73+13=27+343+1= 371
//
//		407 → 43+03+73=64+0+343=40743+03+73=64+0+343= 407
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }

        return result == originalNum;
    }
}