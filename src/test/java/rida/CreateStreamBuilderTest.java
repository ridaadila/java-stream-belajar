package rida;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder()
    {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("rida");
        builder.add("adila").add("oke");

        Stream<String> streamBuilder = builder.build();
        streamBuilder.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimple()
    {
        Stream<Object> stream = Stream.builder().add("build 1").add("build 2").build();
        stream.forEach(System.out::println);
    }
}
