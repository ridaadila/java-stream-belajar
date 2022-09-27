package rida;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeek()
    {
        List.of("rida", "adila", "vania", "test").stream()
                .peek(name-> System.out.println("before upper: "+name))
                .map(String::toUpperCase)
                .peek(hasil-> System.out.println("after upper: "+hasil))
                .forEach(System.out::println);
    }
}
