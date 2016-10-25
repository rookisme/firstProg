import java.util.Scanner;
public class first {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int score;
System.out.print("Enter your score");
score = input.nextInt();

if (score >= 90 && score <= 100){
    System.out.println("Grade a");
        }
else if (score >= 80 && score < 90){
System.out.println("Grade b");
}
else if (score >= 70 && score < 80){
System.out.println("Grade c");
}
else if (score >= 60 && score < 70){
System.out.println("Grade d");
}
else if (score >= 0 && score < 60) {
System.out.println("Grade f");
}
else System.out.println("invalid");


    
        
    }
    }

