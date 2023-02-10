package bookexercises.chapter2;
import java.util.Scanner;
public class ChapterTwoReview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get the remainder when divided by 4: ");
        double number = input.nextDouble();
        double result = (number % 6);
        System.out.println("The remainder of " + number + " is " + result + " when divided by 4");
        input.close();

    }
}
