import java.util.Scanner;

class Scannerexample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);
        System.out.print("Are you graduated (true/false): ");
        boolean isGraduated = scanner.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Is Graduated: " + isGraduated);
        scanner.close();
    }
}