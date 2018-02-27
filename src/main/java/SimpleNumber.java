import java.util.ArrayList;
import java.util.List;

public class SimpleNumber {
    private List<Integer> arrayNumbers = new ArrayList<Integer>();

    public List<Integer> getSimpleNumber(int until){
        for (int x = 1; x <= until; x++) {
            int y = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0){
                    y++;
                }
            }
            if (y <= 2){
                arrayNumbers.add(x);
//                System.out.print(x + " ");
            }
        }
        return arrayNumbers;
    }
}
