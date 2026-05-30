package Lesson7;

import java.math.BigInteger;
import java.security.InvalidParameterException;

public class Functions {
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new InvalidParameterException("Can not calculate factorial for number <" + n + ">");
        }
        if (n < 2) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static double getTriangleArea(int sideA, int sideB, int sideC) {
        double p = (double) (sideA + sideB + sideC) / 2;
        double area = Math.floor(Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)));
        if (Double.isNaN(area) || sideA < 0 || sideB < 0 || sideC < 0) {
            throw new InvalidParameterException("Triangle with sides <" + sideA + "> <" + sideB + "> <" + sideC + "> does not exists");
        }
        return area;
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int substruct(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public static int divide(int n1, int n2) {
        return n1 / n2;
    }

    public static boolean isEqual(int n1, int n2) {
        return n1 == n2;
    }
}
