package rida;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    Stream<String> getStream()
    {
        return Stream.of("rida", "adila", "oke", "test");
    }

    @Test
    void testCollection()
    {
        Set<String> stringSet = getStream().collect(Collectors.toSet());
        System.out.println(stringSet);
        Set<String> unmodifiableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(unmodifiableSet);

        List<String> stringList = getStream().collect(Collectors.toList());
        System.out.println(stringList);
        List<String> unmodifiableList = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(unmodifiableList);
    }

    @Test
    void testMap()
    {
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
                name->name,
                value->value.length()
        ));

        System.out.println(map);
    }
}
