import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listDragon = new ArrayList<>();

        while (true) {
            System.out.println("__________________");
            System.out.println("for exit input - q");
            System.out.println("__________________");
            System.out.print("enter head dragon : ");
            String input = scanner.nextLine();

            if (input.equals("q")){
                System.out.println("Good bay");
                break;
            }

            try {
                int allHeadOfDragons = Integer.parseInt(input);
                int powerAllDragon = 1;
                while (allHeadOfDragons > 4) {
                    powerAllDragon *= 3;
                    allHeadOfDragons -= 3;
                    listDragon.add(3);
                }
                listDragon.add(allHeadOfDragons);
                powerAllDragon *= allHeadOfDragons;

                System.out.println("ANSWER");
                System.out.println("In flock - " + listDragon.size() + " dragons, all powers - " + powerAllDragon);
                System.out.println(listDragon.toString());

            } catch (Exception e) {
                System.out.println("you did not enter a number, repeat please");
            }
            listDragon.clear();
        }
        scanner.close();
    }
}
