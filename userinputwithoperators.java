import java.util.Scanner;

public class userinputwithoperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int Num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int Num2 = scanner.nextInt();
        System.out.println("Sum: " + (Num1 + Num2));
        System.out.println("Difference: " + (Num1 - Num2));
        System.out.println("Product: " + (Num1 * Num2));
        System.out.println("Quotient: " + (Num1 / Num2));
        System.out.println("Remainder: " + (Num1 % Num2));
        System.out.println("Is Num1 equal to Num2? " + (Num1 == Num2));
        System.out.println("Is Num1 not equal to Num2? " + (Num1 != Num2));
        System.out.println("Is Num1 greater than Num2? " + (Num1 > Num2));
        System.out.println("Is Num1 less than Num2? " + (Num1 < Num2));
        System.out.println("Is Num1 greater than or equal to Num2? " + (Num1 >= Num2));
        System.out.println("Is Num1 less than or equal to Num2? " + (Num1 <= Num2));
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));
        scanner.close();

    }
}