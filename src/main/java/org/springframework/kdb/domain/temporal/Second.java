package org.springframework.kdb.domain.temporal;

import java.text.DecimalFormat;

public class Second implements Comparable<Second> {
    
    /**
     * Number of seconds passed.
     */
    public int i;
    
    public Second(int x) {
        i = x;
    }
    
    @Override
    public String toString() {
        return i == Integer.MIN_VALUE
                ? ""
                : new Minute(i / 60).toString() + ':' + new DecimalFormat("00").format(i % 60);
    }
    
    @Override
    public boolean equals(final Object o) {
        return (o instanceof Second) ? ((Second) o).i == i : false;
    }
    
    @Override
    public int hashCode() {
        return i;
    }
    
    public int compareTo(Second s) {
        return i - s.i;
    }
}
