package rida;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {

    @Test
    void testAnyMatch()
    {
        boolean match = List.of(1,2,3,4,5,6,7,8,9,10).stream().anyMatch(value->value>10);
        System.out.println(match);
    }

    @Test
    void testAllMatch()
    {
        boolean match = List.of(1,2,3,4,5,6,7,8,9,10).stream().allMatch(value->value>0);
        System.out.println(match);
    }

    @Test
    void testNoneMatch()
    {
        boolean match = List.of(1,2,3,4,5,6,7,8,9,10).stream().noneMatch(value->value<0);
        System.out.println(match);
    }
}
