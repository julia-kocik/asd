package generics;

import java.util.ArrayList;

public class Data<T,F> implements Movable<T,F> {
    private T var1;
    private F var2;

    public Data(T var1, F var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T getVar1() {
        return var1;
    }

    public F getVar2() {
        return var2;
    }

    public void setVar2(F var2) {
        this.var2 = var2;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public T show() {
        return getVar1();
    }

    @Override
    public String toString() {
        return "Data{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                '}';
    }
}