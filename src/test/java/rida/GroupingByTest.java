package rida;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {

    @Test
    void testGroupingBy()
    {
        Map<String, List<Integer>> collect =
                Stream.of(1,2,3,4,5,6,7,8,9,10)
                        .collect(Collectors.groupingBy(
                                value->value > 5 ? "besar" : "kecil"
                        ));
        System.out.println(collect);
    }
}
