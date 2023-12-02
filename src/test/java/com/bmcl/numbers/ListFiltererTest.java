package com.bmcl.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFiltererTest {

    @Test
    public void filterAcceptAll() {
        List<Integer> list = Arrays.asList(-1, 2, 6, 1, 4, 5, 7);
        List<Integer> expected =Arrays.asList(-1, 2, 6, 1, 4, 5, 7);

        GenericListFilter listFilter = Mockito.mock(GenericListFilter.class);
        Mockito.when(listFilter.accept(Mockito.anyInt())).thenReturn(true);
        ListFilterer listFilterer = new ListFilterer(listFilter);
        List<Integer> filtered = listFilterer.filter(list);

        Assertions.assertEquals(expected, filtered);
    }

    @Test
    public void filterAcceptNone() {
        List<Integer> list = Arrays.asList(-1, 2, 6, 1, 4, 5, 7);
        List<Integer> expected = Collections.emptyList();

        GenericListFilter listFilter = Mockito.mock(GenericListFilter.class);
        Mockito.when(listFilter.accept(Mockito.anyInt())).thenReturn(false);
        ListFilterer listFilterer = new ListFilterer(listFilter);
        List<Integer> filtered = listFilterer.filter(list);

        Assertions.assertEquals(expected, filtered);
    }
}
