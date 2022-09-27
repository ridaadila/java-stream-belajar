package rida;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation()
    {
        List<String> stringList = List.of("rida", "adila", "panda", "its");
        Stream<String> stringStream = stringList.stream();
        Stream<String> upperStringStream = stringStream.map(value->value.toUpperCase());
        stringStream.forEach(System.out::println);
    }
}
