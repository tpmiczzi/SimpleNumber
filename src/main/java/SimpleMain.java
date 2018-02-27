import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleMain {
    public static void main(String[] args) {
        SimpleNumber simpleNumber = new SimpleNumber();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("enter the number from which you want to get all the prime numbers : ");
            String input = scanner.nextLine();

            try {
                int inputNumber = Integer.parseInt(input);
                List<Integer> testArray = simpleNumber.getSimpleNumber(inputNumber);
                System.out.println("Answer: from the number " +inputNumber+" can get prime numbers: ");
                System.out.println(testArray.toString());
                break;
            } catch (Exception e) {
                System.out.println("you did not enter a number, repeat");
            }
        }

        scanner.close();

    }
}
