package rida;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream()
    {
        Stream<String> emptyStream = Stream.empty();
        Stream<String> oneStream = Stream.of("rida");
        String data = null;
        Stream<String> streamEmptyOrNot = Stream.ofNullable(data);
     }

     @Test
    void testCreateStreamFromArray()
     {
         Stream<String> stringStream = Stream.of("rida", "adila", "oke");

         stringStream.forEach(value -> System.out.println(value));

         Stream<Integer> integerStream = Stream.of(1,2,3);
         integerStream.forEach(System.out::println);

         String[] array = new String[]{
           "satu", "dua", "tiga"
         };

         Stream<String> streamFromArray = Arrays.stream(array);
     }

     @Test
    void testCreateStreamFromCollection()
     {
         Collection<String> stringCollection = List.of("rida", "adila", "test");
         Stream<String> stringStream = stringCollection.stream();

         stringStream.forEach(System.out::println);

         Stream<String> stringStream2 = stringCollection.stream();
         stringStream2.forEach(System.out::println);
     }

     @Test
    void testCreateInfiniteStream()
     {
         Stream<String> streamGenerate = Stream.generate(()->"ridasupplier");
         Stream<Integer> streamIterate = Stream.iterate(1, value -> value+1);
//         streamIterate.forEach(System.out::println);
     }
}
