package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV2 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate isEven = number -> number % 2 == 0;
        Predicate isOdd = number -> number % 2 != 0;

        System.out.println(filter(list, isEven));
        System.out.println(filter(list, isOdd));
    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> filtered = new java.util.ArrayList<>();
        for (Integer number : list) {
            if (predicate.test(number)) {
                filtered.add(number);
            }
        }
        return filtered;
    }

    @FunctionalInterface
    interface Predicate {
        boolean test(Integer number);
    }

}
