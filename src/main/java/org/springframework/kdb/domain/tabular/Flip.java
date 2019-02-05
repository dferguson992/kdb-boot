package org.springframework.kdb.domain.tabular;

import javafx.util.Pair;
import org.springframework.kdb.domain.c;

/**
 * {@code Flip} represents a kdb+ table.
 */
public class Flip extends Pair<String[], Object[]> {
    
    public Flip(Pair X) {
        super((String[]) X.getKey(), (Object[]) X.getValue());
    }
    
    public Object at(String s) {
        return this.getValue()[c.find(this.getKey(), s)];
    }
}