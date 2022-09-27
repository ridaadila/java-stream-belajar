package rida;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMap()
    {
        List.of("rida", "adila", "vania").stream()
                .map(name->name.toUpperCase())
                .map(value->value.length())
                .forEach(panjang-> System.out.println(panjang));
    }

    @Test
    void testFlatMap()
    {
        List.of("rida", "adila", "vania").stream()
                .map(name->name.toUpperCase())
                .flatMap(value-> Stream.of(value.length(), value))
                .flatMap(value-> Stream.of(value, value))
                .forEach(panjang-> System.out.println(panjang));
    }
}
