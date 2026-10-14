
package com.example;

public class App {

    public int[] fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Number must not be negative");
        }

        int[] series = new int[n];
        if (n > 0) series[0] = 0;
        if (n > 1) series[1] = 1;

        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        return series;
    }

    public static void main(String[] args) {
        App app = new App();
        int[] series = app.fibonacci(10);

        System.out.print("Fibonacci Series: ");
        for (int number : series) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
