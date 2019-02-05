package org.springframework.kdb.domain.temporal;

import java.text.DecimalFormat;

/**
 * {@code Month} represents kdb+ month type.
 */
public class Month implements Comparable<Month> {
    /**
     * Number of months since Jan 2000
     */
    public int i;
    
    public Month(int x) {
        i = x;
    }
    
    @Override
    public String toString() {
        int m = i + 24000, y = m / 12;
        return i == Integer.MIN_VALUE ? ""
                : new DecimalFormat("00").format(y / 100)
                + new DecimalFormat("00").format(y % 100)
                + "-" + new DecimalFormat("00").format(1 + m % 12);
    }
    
    @Override
    public boolean equals(final Object o) {
        return (o instanceof Month) ? ((Month) o).i == i : false;
    }
    
    @Override
    public int hashCode() {
        return i;
    }
    
    public int compareTo(Month m) {
        return i - m.i;
    }
}