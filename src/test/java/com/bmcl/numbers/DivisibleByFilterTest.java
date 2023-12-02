package com.bmcl.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {

    @Test
    void accept() {
        List<Integer> list = Arrays.asList(2,4,5);
        DivisibleByFilter divisibleByFilter = new DivisibleByFilter(2);
        for (Integer num: list) {
            boolean accept = divisibleByFilter.accept(num);
            if (num % 2 == 0) {
                Assertions.assertTrue(accept);
            } else {
                Assertions.assertFalse(accept);
            }
        }
    }
}
