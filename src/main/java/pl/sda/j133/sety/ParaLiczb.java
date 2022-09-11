package pl.sda.j133.sety;

import java.util.Objects;

/**
 * @author Paweł Recław, AmeN
 * @project 133
 * @created 11.09.2022
 */
public class ParaLiczb {
    private int a;
    private int b;

    public ParaLiczb(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // odczyt
    public int getA() {
        return a;
    }

    // zapis
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParaLiczb paraLiczb = (ParaLiczb) o;
        return a == paraLiczb.a && b == paraLiczb.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "ParaLiczb{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
