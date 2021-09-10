import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi there!");

        //Added a scanner object
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.nextLine();
        }


        System.out.println(input);
    }
}
