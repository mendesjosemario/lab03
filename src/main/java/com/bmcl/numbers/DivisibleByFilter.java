package com.bmcl.numbers;

public class DivisibleByFilter implements GenericListFilter{

    private Integer divisibleBy;

    public DivisibleByFilter(Integer divisibleBy) {
        this.divisibleBy = divisibleBy;
    }

    @Override
    public boolean accept(Integer number) {
        return number % divisibleBy == 0;
    }
}
