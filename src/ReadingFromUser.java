/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rook
 */
import java.util.Scanner;
public class ReadingFromUser {
public static void main (String[] args) {
int sum, division, remainder, twoDigits;
Scanner userInput = new Scanner(System.in);
    System.out.print("آدخل الرقمين مع ملاحظه ان البرنامج لا يقبل اقل من خانتين ولا اكثر ");
    twoDigits = userInput.nextInt();

while (twoDigits <= 9 || twoDigits >= 100) {

    System.out.print("رقم من خانتين فقط");
    twoDigits = userInput.nextInt();
}
remainder = twoDigits%10;
        division = twoDigits / 10;
        sum = remainder + division;
        System.out.printf("%s %d %n %s %d %n", "الرقم المدخل هو ", twoDigits, "مجموع الرقمان هو ", sum);
//See you!
		//1. Math.pow returns double, need cast, display 256
		//int result = (int) Math.pow(2, 8);
		//System.out.println("Math.pow(2, 8) : " + result);
		
		//2. Wrong, ^ is a binary XOR operator, display 10
		//int result2 = 2 ^ 8;
		//System.out.println("2 ^ 8 : " + result2);
		
		//3. Test double , display 127628.16
		//double result3 = Math.pow(10.5, 5);
		//System.out.println("Math.pow(10.5, 5) : " + result3);
    }
}