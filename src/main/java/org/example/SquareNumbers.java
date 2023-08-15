package org.example;

@FunctionalInterface
public interface SquareNumbers<P, Q, R> {
    R apply(P p, Q q);
}
