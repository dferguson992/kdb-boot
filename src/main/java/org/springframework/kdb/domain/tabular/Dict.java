package org.springframework.kdb.domain.tabular;

import javafx.util.Pair;

/**
 * {@code Dict} represents the kdb+ dictionary type.
 */
public class Dict extends Pair<Object, Object> {
    
    public Dict(Object X, Object Y) {
        super(X, Y);
    }
}