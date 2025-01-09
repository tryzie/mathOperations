import java.util.Scanner;
import com.mathLibrary.MathLibrary;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Select a choice");
        System.out.println("1. add");
        System.out.println("2. subtract");
        System.out.println("3. multiply");
        System.out.println("4. division");
        System.out.println("Please enter your choice below");

        int choice = scan.nextInt();

        if(choice<1 || choice>4) {
            System.out.println("Invalid choice");
        } else {
            System.out.println("Enter the first number");
            double num1 = scan.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scan.nextDouble();

            double results;


            switch (choice) {

                case 1:
                    results = MathLibrary.add(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + results);
                    break;
                case 2:
                    results = MathLibrary.subtract(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + results);
                    break;
                case 3:
                    results = MathLibrary.multiply(num1, num2);
                    System.out.println(num1 + " * " + num2 + " = " + results);
                    break;
                case 4:
                    results = MathLibrary.divide(num1, num2);
                    System.out.println(num1 + " / " + num2 + " = " + results);
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
