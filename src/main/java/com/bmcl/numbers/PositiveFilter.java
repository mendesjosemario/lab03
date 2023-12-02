package com.bmcl.numbers;

public class PositiveFilter implements GenericListFilter{

    @Override
    public boolean accept(Integer number) {
        return number != null && number > 0;
    }
}
