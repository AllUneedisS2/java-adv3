package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMainV1 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = fileterEvenNumbers(list);
        System.out.println("evenNumbers = " + evenNumbers);

        List<Integer> oddNumbers = filterOddNumbers(list);
        System.out.println("oddNumbers = " + oddNumbers);

    }

    private static List<Integer> filterOddNumbers(List<Integer> list) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : list) {
            if (number % 2 != 0) {
                filtered.add(number);
            }
        }
        return filtered;
    }

    private static List<Integer> fileterEvenNumbers(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                filtered.add(number);
            }
        }
        return filtered;
    }

}