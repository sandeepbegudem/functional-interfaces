package org.example;

@FunctionalInterface
public interface QuatroNumbers <K, L, M, N, R>{
    R apply(K k, L l, M m, N n);
}
