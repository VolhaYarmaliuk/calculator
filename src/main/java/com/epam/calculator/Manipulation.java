package com.epam.calculator;

/**
 * Created by Olga_Yarmaliuk on 9/7/2016.
 */
public class Manipulation {
    double add(double a, double b) {
        double answer = a + b;
        return answer;
    }

    double subtract(double a, double b) {
        double answer = a - b;
        return answer;
    }

    double multiply(double a, double b) {
        double answer = a * b;
        return answer;
    }

    double divide(double a, double b) {
        double answer = a / b;
        return answer;
    }

    double power(double a, double b) {
        double answer = a;

        for (int x = 2; x <= b; x++) {
            answer *= a;
        }

        return answer;
    }

}
