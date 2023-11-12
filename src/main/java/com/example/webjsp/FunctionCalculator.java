package com.example.webjsp;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class FunctionCalculator {
    public static double calculateFunction(double x, double a, double b, double c) {
        double EPS = 1E-9;
        if (x < 1.4 - EPS) {
            return a * x * x + b * x + c;
        } else if (x > 1.400 + EPS) {
            return (a + b * x) / Math.sqrt(x * x + 1);
        } else {
            return a / x + Math.sqrt(x * x + 1);
        }
    }

    public static int calculateSteps(double start, double end, double step) {
        return (int) ((end - start) / step) + 1;
    }

    public static double[] generateXValues(double start, double end, double step, double a, double b, double c) {
        int steps = calculateSteps(start, end, step);
        double[] xValues = new double[steps];
        for (int i = 0; i < steps; i++) {
            xValues[i] = start + i * step;
        }
        return xValues;
    }

    public static double[] generateYValues(double[] xValues, double a, double b, double c) {
        double[] yValues = new double[xValues.length];
        for (int i = 0; i < xValues.length; i++) {
            yValues[i] = calculateFunction(xValues[i], a, b, c);
        }
        return yValues;
    }

    public static int findIndexOfMax(double[] array) {
        int maxIndex = 0;
        double maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxIndex = i;
                maxValue = array[i];
            }
        }
        return maxIndex;
    }

    public static int findIndexOfMin(double[] array) {
        int minIndex = 0;
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }
        return minIndex;
    }

    public static double calculateSum(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum;
    }

    public static double calculateAverage(double[] array) {
        return calculateSum(array) / array.length;
    }
}
