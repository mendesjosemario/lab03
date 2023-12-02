package com.bmcl.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {

    @Test
    void accept() {
        List<Integer> list = Arrays.asList(-1,1);
        PositiveFilter positiveFilter = new PositiveFilter();
        for (Integer num: list) {
            boolean accept = positiveFilter.accept(num);
            if (num > 0) {
                Assertions.assertTrue(accept);
            } else {
                Assertions.assertFalse(accept);
            }
        }
    }
}
