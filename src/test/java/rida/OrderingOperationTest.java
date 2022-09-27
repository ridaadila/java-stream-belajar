package rida;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testSorted()
    {
        List.of("rida", "adila", "test").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator()
    {
        List.of("rida", "adila", "test").stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
