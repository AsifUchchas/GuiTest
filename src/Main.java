import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi there!");

        //Added a scanner object
        Scanner scanner = new Scanner(System.in);
        String input = null;
        try  {
            input = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(input);

        //Another input option added
        System.out.println("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int n2 = scanner.nextInt();
    }
}
