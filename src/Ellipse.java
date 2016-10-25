
/********************** 
 * Write a Java class called Ellipse that reads from the user 2 integers (a and b) 
 * that represent lengths of the semi-major axis and the semi-minor axis of an ellipse.
Then calculates and prints the area of this ellipse (rounded to 1 decimal place) 
* according to the following formula:
area = Π a b
In addition, a message indicates if the ellipse is large or small should be printed.
The ellipse is considered to be large if its area is greater than 150, 
* otherwise it is considered to be small. 
**********************/

import java.util.Scanner;

public class Ellipse {

public static void main (String[]  args) {

Scanner input = new Scanner(System.in);

int numberA, numberB;

double area;

System.out.print("Enter the length of semi major axis: ");

numberA = input.nextInt();

System.out.print('Enter the length of the semi minor axis: ');

numberB = input.nextInt();

area = (Math.PI * (double) numberA * (double) numberB);

if (area > 150) {

System.out.printf('%s %.1f%n %s', 'The area of the Ellipse is: ', area, 'The ellipse is large.');

}

else {

System.out.printf('%s %.1f %n %s', 'The area of the Ellipse is: ', area, 'The ellipse is small.');

}

}

}