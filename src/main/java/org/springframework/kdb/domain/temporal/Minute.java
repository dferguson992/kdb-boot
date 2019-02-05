package org.springframework.kdb.domain.temporal;

import java.text.DecimalFormat;

/**
 * {@code Minute} represents kdb+ minute type.
 */
public class Minute implements Comparable<Minute> {
    /**
     * Number of minutes passed.
     */
    public int i;
    
    public Minute(int x) {
        i = x;
    }
    
    @Override
    public String toString() {
        return i == Integer.MIN_VALUE
                ? ""
                : new DecimalFormat("00").format(i / 60)
                + ":"
                + new DecimalFormat("00").format(i % 60);
    }
    
    @Override
    public boolean equals(final Object o) {
        return (o instanceof Minute) ? ((Minute) o).i == i : false;
    }
    
    @Override
    public int hashCode() {
        return i;
    }
    
    public int compareTo(Minute m) {
        return i - m.i;
    }
}
