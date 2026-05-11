package Lesson2;

public class Lesson2Class {
    //#1
    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //#2
    public void checkSumSign() {
        int a = 568;
        int b = 453;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //#3
    public void printColor() {
        int value = 306;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //#4
    public void compareNumbers() {
        int a = 255;
        int b = 35;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //#5
    public boolean checkSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    //#6
    public void checkNumberSign(int n) {
        if (n >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //#7
    public boolean isNumberNegative(int n) {
        return n < 0;
    }

    //#8
    public void printLine(String line, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(line);
        }
    }

    //#9
    public boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    //#10
    public void changeDigitsInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
    }

    //#11
    public void initArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    //#12
    public void multiplyArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    //#13
    public void setArrayDiagonals(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    //#14
    public int[] createArray(int len, int initValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initValue;
        }
        return arr;
    }
}
