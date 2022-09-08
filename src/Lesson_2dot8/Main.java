package Lesson_2dot8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        List numbers = Stream.of(1, 2, 3)
                .map(v -> v.toString())
                .collect(Collectors.toList());

        Stream.of(1, 5, 2, 10)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        String string = Stream.of("a", "b", "c")
                .collect(Collectors.joining());

        int max = Stream.of(1, 5, 2, 10)
                .max(Comparator.naturalOrder())
                .get();

        int sum = IntStream.of(1, 2, 3)
                .sum();

        double avg = IntStream.of(1, 5, 2, 10)
                .average()
                .getAsDouble();

        boolean allEven = IntStream.of(1, 5, 2, 10)
                .allMatch(e -> e % 2 == 0);

        boolean anyEven = IntStream.of(1, 5, 2, 10)
                .anyMatch(e -> e % 2 == 0);
    }
}
