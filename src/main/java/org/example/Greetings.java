package org.example;

@FunctionalInterface
public interface Greetings<R> {
    R apply();
}
