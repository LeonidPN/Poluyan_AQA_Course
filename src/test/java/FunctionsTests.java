import Lesson7.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigInteger;
import java.security.InvalidParameterException;

public class FunctionsTests {
    @DisplayName("Вычисление факториала")
    @ParameterizedTest
    @CsvSource({"0,1", "5,120", "30, 265252859812191058636308480000000"})
    public void factorialTest(int n, BigInteger res) {
        Assertions.assertEquals(Functions.factorial(n), res);
    }

    @DisplayName("Вычисление факториала отрицательного числа")
    @ParameterizedTest
    @ValueSource(ints = {-3, -1000})
    public void factorialNegativeNumberTest(int n) {
        InvalidParameterException thrown = Assertions.assertThrows(InvalidParameterException.class, () -> {
            Functions.factorial(n);
        });
        Assertions.assertEquals("Can not calculate factorial for number <" + n + ">", thrown.getMessage());
    }

    @DisplayName("Вычисление площади треугольника")
    @ParameterizedTest
    @CsvSource({"1,2,3,0", "5,7,9,17", "22,48,34,335"})
    public void triangleAreaTest(int a, int b, int c, double res) {
        Assertions.assertEquals(Functions.getTriangleArea(a, b, c), res);
    }

    @DisplayName("Вычисление площади треугольника (для несуществующего треугольника)")
    @ParameterizedTest
    @CsvSource({"5,7,15", "2,3,36", "5,7,-9"})
    public void triangleAreaFailTest(int a, int b, int c) {
        InvalidParameterException thrown = Assertions.assertThrows(InvalidParameterException.class, () -> {
            Functions.getTriangleArea(a, b, c);
        });
        Assertions.assertEquals("Triangle with sides <" + a + "> <" + b + "> <" + c + "> does not exists", thrown.getMessage());
    }

    @DisplayName("Сумма чисел")
    @ParameterizedTest
    @CsvSource({"1,2,3", "5,-7,-2", "-22,48,26"})
    public void addTest(int a, int b, int res) {
        Assertions.assertEquals(Functions.add(a, b), res);
    }

    @DisplayName("Разность чисел")
    @ParameterizedTest
    @CsvSource({"1,2,-1", "5,-7,12", "-22,48,-70"})
    public void substructTest(int a, int b, int res) {
        Assertions.assertEquals(Functions.substruct(a, b), res);
    }

    @DisplayName("Произведение чисел")
    @ParameterizedTest
    @CsvSource({"1,2,2", "5,-7,-35", "-22,-48,1056"})
    public void multiplyTest(int a, int b, int res) {
        Assertions.assertEquals(Functions.multiply(a, b), res);
    }

    @DisplayName("Деление чисел")
    @ParameterizedTest
    @CsvSource({"2,1,2", "5,-7,0", "-48,22,-2"})
    public void divideTest(int a, int b, int res) {
        Assertions.assertEquals(Functions.divide(a, b), res);
    }

    @DisplayName("Равенство чисел")
    @ParameterizedTest
    @CsvSource({"1,1,true", "-5,-5,true", "-22,22,false"})
    public void isEqualTest(int a, int b, boolean res) {
        Assertions.assertEquals(Functions.isEqual(a, b), res);
    }
}
