package com.bmcl.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {

    private GenericListFilter filter;
    public ListFilterer(GenericListFilter filter) {
        this.filter = filter;
    }

    public List<Integer> filter(List<Integer> list) {
        List<Integer> resp = new ArrayList<>();
        for (Integer num: list) {
            if (filter.accept(num)) {
                resp.add(num);
            }
        }
        return resp;
    }

}
