package bookexercises.chapter3;
import java.util.Scanner;
public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number % 2 == 0 && number % 3 == 0){
            System.out.println(number + " is divisable by 2 and 3.");
        }
        if (number % 2 == 0 || number % 3 == 0){
            System.out.println(number + " is divisable by 2 or 3.");
        }
        if (number % 2 == 0 ^ number % 3 == 0){
            System.out.println(number + " is divisable by 2 or 3, but not both.");
        }
        input.close();
    }
}
//This program does not check to see if neither 2 or 3 works, for example, 19 gets no response
