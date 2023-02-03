package bookexercises.chapter2;

public class FindingErrors {
    public static void main(String[] args) {
        double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;
        System.out.println("j is " + j + " and k is " + k);
    }
}
// Two errors found, String was not capitalized, and needed to add "static"