package rida;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntermediateTerminalOperation()
    {
        List<String> names = List.of("rida", "adila", "azifah");
        Stream<String> stringStream = names.stream();
        stringStream.map(name->{
            System.out.println("Change " + name + " to uppercase");
                return name.toUpperCase();
        }).forEach(value-> System.out.println("print "+value));
    }
}
