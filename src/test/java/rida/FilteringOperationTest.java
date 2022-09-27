package rida;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

    @Test
    void testFiltering()
    {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,10);

        integerList.stream().filter(value->value%2==0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct()
    {
        List.of("rida","rida","adila").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
