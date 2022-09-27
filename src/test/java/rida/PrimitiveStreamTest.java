package rida;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class PrimitiveStreamTest {

    @Test
    void testCreate()
    {
        IntStream intStream = IntStream.range(1,10);
        intStream.forEach(System.out::println);
    }
}
