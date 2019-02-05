package org.springframework.kdb.domain.temporal;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * {@code Timespan} represents kdb+ timestamp type.
 */
public class Timespan implements Comparable<Timespan> {
    /**
     * Number of nanoseconds passed.
     */
    public long j;
    
    public Timespan(long x) {
        j = x;
    }
    
    /**
     * Constructs {@code Timespan} using time since midnight and default timezone.
     */
    public Timespan() {
        this(TimeZone.getDefault());
    }
    
    /**
     * Constructs {@code Timespan} using time since midnight and default timezone.
     *
     * @param tz {@code TimeZone} to use for deriving midnight.
     */
    public Timespan(TimeZone tz) {
        Calendar c = Calendar.getInstance(tz);
        long now = c.getTimeInMillis();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        j = (now - c.getTimeInMillis()) * 1000000L;
    }
    
    @Override
    public String toString() {
        if (j == Long.MIN_VALUE)
            return "";
        String s = j < 0 ? "-" : "";
        long jj = j < 0 ? -j : j;
        int d = ((int) (jj / 86400000000000L));
        if (d != 0)
            s += d + "D";
        return s
                + new DecimalFormat("00").format((int) ((jj % 86400000000000L) / 3600000000000L))
                + ":" + new DecimalFormat("00").format((int) ((jj % 3600000000000L) / 60000000000L))
                + ":" + new DecimalFormat("00").format((int) ((jj % 60000000000L) / 1000000000L))
                + "." + new DecimalFormat("000000000").format((int) (jj % 1000000000L));
    }
    
    public int compareTo(Timespan t) {
        return j > t.j ? 1 : j < t.j ? -1 : 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return (o instanceof Timespan) ? ((Timespan) o).j == j : false;
    }
    
    @Override
    public int hashCode() {
        return (int) (j ^ (j >>> 32));
    }
}
