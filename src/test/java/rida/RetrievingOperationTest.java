package rida;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class RetrievingOperationTest {

    @Test
    void testLimit()
    {
        List.of("rida", "adila", "test", "123")
                .stream().limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip()
    {
        List.of("rida", "adila", "test", "123")
                .stream().skip(2)
                .forEach(System.out::println);
    }

    @Test
    void takeWhile()
    {
        List.of("rida", "adila", "test", "123")
                .stream().takeWhile(value->value.length()<=4)
                .forEach(System.out::println);
    }

    @Test
    void dropWhile()
    {
        List.of("rida", "adila", "test", "123")
                .stream().dropWhile(value->value.length()<=4)
                .forEach(System.out::println);
    }

    @Test
    void findAny()
    {
        Optional<String> stringOptional = List.of("rida", "adila", "test", "123").stream().findAny();
        stringOptional.ifPresent(value->{
            System.out.println(value);
        });
    }

    @Test
    void findFirst()
    {
        Optional<String> stringOptional = List.of("rida", "adila", "test", "123").stream().findFirst();
        stringOptional.ifPresent(value->{
            System.out.println(value);
        });
    }
}
