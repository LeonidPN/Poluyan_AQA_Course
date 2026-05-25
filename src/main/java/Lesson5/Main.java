package Lesson5;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"10", "14", "13", "6"},
                {"5", "14", "19", "8"},
                {"4", "15", "25", "16"},
                {"44", "3", "5", "6"},
                {"0", "12", "33", "31"}
        };
        try {
            System.out.println(sumArrayElements(arr1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        String[][] arr2 = new String[][]{
                {"10", "14", "13", "6"},
                {"4", "15", "16"},
                {"44", "3", "5", "6"},
                {"0", "12", "33", "31"}
        };
        try {
            System.out.println(sumArrayElements(arr2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        String[][] arr3 = new String[][]{
                {"10", "14", "13", "6"},
                {"4", "15", "abc", "16"},
                {"44", "3", "5", "6"},
                {"0", "12", "33", "31"}
        };
        try {
            System.out.println(sumArrayElements(arr3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        String[][] arr4 = new String[][]{
                {"10", "14", "13", "6"},
                {"4", "15", "8", "16"},
                {"44", "3", "5", "6"},
                {"0", "12", "33", "31"}
        };
        try {
            System.out.println(sumArrayElements(arr4));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        int[][] arr5 = new int[5][5];
        try {
            for (int i = 0; i < arr5.length; i++) {
                for (int j = 0; j <= arr5.length; j++) {
                    arr5[i][j] = 1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int sumArrayElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
