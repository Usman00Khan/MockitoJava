package com.application;

public class Application {
    private CalculateServices cs;

    public int add(int a, int b) {
        return cs.add(a, b);
    }

    public int mul(int a, int b) {
        return cs.mul(a, b);
    }

    public int sub(int a, int b) {
        return cs.sub(a, b);
    }

    public int div(int a, int b) {
        return cs.div(a, b);
    }

    public void setCalculateServices(CalculateServices c)
    {
        this.cs = c;
    }

}
