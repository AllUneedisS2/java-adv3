package stream.start;

import java.util.List;
import java.util.stream.Stream;

public class StreamStartMain {

    public static void main(String[] args) {
        
        List<String> items = List.of("apple", "banana", "cherry");

        Stream<String> itemStream = items.stream();

        itemStream
            .filter(item -> item.startsWith("b"))
            .map(String::toUpperCase)
            .forEach(System.out::println);

    }

}
