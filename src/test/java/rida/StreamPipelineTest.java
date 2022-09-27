package rida;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

public class StreamPipelineTest {

    @Test
    void testStreamPipeline()
    {
        List<String> stringList = List.of("rida", "adila", "azifah", "vania");

        stringList.stream().map(name->name.toUpperCase())
                .map(upper->"Mrs. " + upper)
                .forEach(System.out::println);
    }
}
