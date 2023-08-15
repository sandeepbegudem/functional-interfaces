package org.example;

@FunctionalInterface
public interface CubeNumbers <X, Y, Z, R>{
    R apply(X x, Y y, Z z);
}
