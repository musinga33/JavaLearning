import java.util.Scanner;

public class simplecalculatorwithloops {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int Number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(Number + "x " + i + "=" + (Number * i));
        }

        input.close();
    }
}