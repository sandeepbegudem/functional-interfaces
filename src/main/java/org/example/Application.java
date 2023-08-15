package org.example;

import java.util.function.BiFunction;

public class Application {

    public static class FunctionalInterface{

        public static Integer addNumbers(Integer w, Integer x){
            BiFunction<Integer, Integer, Integer> addition =
                    (a, b) -> a + b;
            return addition.apply(w, x);
        }

        public static Integer subtractNumbers(Integer e, Integer f){
            BiFunction<Integer, Integer, Integer> subtraction =
                    (a, b) -> b - a;
            return subtraction.apply(e, f);
        }

        public static Integer multiplyNumbers(Integer s, Integer t){
            BiFunction<Integer, Integer, Integer> multiply =
                    (a, b) -> a * b;
            return multiply.apply(s, t);
        }

        public static Integer divideNumbers(Integer p, Integer q){
            BiFunction<Integer, Integer, Integer> division =
                    (a, b) -> b / a;
            return division.apply(p, q);
        }

        public static String morningGreetings(){
            Greetings<String>  morning = () -> "Good Morning!...";
           return morning.apply();
        }

        public static String eveningGreetings(){
            Greetings<String> evening = () -> "Good Evening!...";
            return evening.apply();
        }

        public static String gooddayGreetings(){
            Greetings<String> goodday = () -> "Have a Great Day!...";
            return goodday.apply();
        }

        public static Integer numbersSquare(Integer x, Integer y){

            // SquareNumbers is a custom functional interface
            SquareNumbers<Integer, Integer, Integer> square =
                    (a, b) -> a * b;
            return square.apply(x, y);
        }

        public static Integer cubeNumbers(Integer s, Integer t, Integer u){
            CubeNumbers<Integer, Integer, Integer, Integer> cube =
                    (a, b, c) -> a * b * c;
            return cube.apply(s, t, u);
        }

        public static Integer numPowerOfFour(Integer p, Integer q, Integer r, Integer s){
            QuatroNumbers<Integer, Integer, Integer, Integer, Integer> numberFourTimes =
                    (a, b, c, d) -> a * b * c * d;
             return numberFourTimes.apply(p, q, r, s);
        }
    }
    public static void main(String[] args) {

        System.out.println(FunctionalInterface.addNumbers(25, 25));

        System.out.println(FunctionalInterface.subtractNumbers(9,59));

        System.out.println(FunctionalInterface.multiplyNumbers(25, 4));

        System.out.println(FunctionalInterface.divideNumbers(9, 81));

        System.out.println(FunctionalInterface.morningGreetings());

        System.out.println(FunctionalInterface.eveningGreetings());

        System.out.println(FunctionalInterface.gooddayGreetings());

        // Custom Functional Interfaces
        System.out.println(FunctionalInterface.numbersSquare(9, 9));

        System.out.println(FunctionalInterface.cubeNumbers(9, 9, 9));

        System.out.println(FunctionalInterface.numPowerOfFour(4, 4, 4, 4));

    }
}