package Lesson2;

public class Main {
    public static void main(String[] args) {
        Lesson2Class lesson2Class = new Lesson2Class();

        //#1
        //lesson2Class.printThreeWords();

        //#2
        //lesson2Class.checkSumSign();

        //#3
        //lesson2Class.printColor();

        //#4
        //lesson2Class.compareNumbers();

        //#5
        //System.out.println(lesson2Class.checkSum(5, 16));

        //#6
        //lesson2Class.checkNumberSign(-1);

        //#7
        //System.out.println(lesson2Class.isNumberNegative(35));

        //#8
        //lesson2Class.printLine("line", 4);

        //#9
        //System.out.println(lesson2Class.isLeapYear(2020));

        //#10
        int[] arr10 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        lesson2Class.changeDigitsInArray(arr10);
        //System.out.println(Arrays.toString(arr10));

        //#11
        int[] arr11 = new int[100];
        lesson2Class.initArray(arr11);
        //System.out.println(Arrays.toString(arr11));

        //#12
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        lesson2Class.multiplyArrayElements(arr12);
        //System.out.println(Arrays.toString(arr12));

        //#13
        int[][] arr13 = new int[8][8];
        lesson2Class.setArrayDiagonals(arr13);
        for (int[] arr : arr13) {
            //System.out.println(Arrays.toString(arr));
        }

        //#14
        int[] arr14 = lesson2Class.createArray(10, 55);
        //System.out.println(Arrays.toString(arr14));

    }
}