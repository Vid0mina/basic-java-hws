package ru.ushakova.java.basic.hws;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static ru.ushakova.java.basic.hws.Application.checkOneTwo;
import static ru.ushakova.java.basic.hws.Application.returnArr;

class ApplicationTest {

    public static Stream<Arguments> initialArrays() {
        List<Arguments> out = new ArrayList<>();
        int[] array = {1, 2, 1, 2, 2};
        int[] array2 = {1, 1, 1, 1, 1};
        int[] array3 = {1, 2, 1, 2, 2, 2};
        int[] array4 = {1, 1, 2, 1, 1, 1};
        int[] array5 = {8, 2, 1, 2, 2, 2};
        int[] array6 = {8, 2, 8, 2, 2, 2};
        out.add(Arguments.arguments(array));
        out.add(Arguments.arguments(array2));
        out.add(Arguments.arguments(array3));
        out.add(Arguments.arguments(array4));
        out.add(Arguments.arguments(array5));
        out.add(Arguments.arguments(array6));
        return out.stream();
    }

    @DisplayName("Копирование элементов после последней 1.")
    @MethodSource("initialArrays")
    @ParameterizedTest
    public void returnArr1(int[] arr) {
        assertDoesNotThrow(() -> returnArr(arr));
    }

    @DisplayName("Исключение при отсутствии 1.")
    @MethodSource("initialArrays")
    @ParameterizedTest
    public void returnArr2(int[] arr) {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> returnArr(arr));
        assertEquals("В массиве не найдено ни одной единицы.", runtimeException.getMessage());
    }

    @DisplayName("Проверка на последовательность 1 и 2.")
    @MethodSource("initialArrays")
    @ParameterizedTest
    void checkOneTwo1(int[] arr) {
        assertDoesNotThrow(() -> checkOneTwo(arr));
    }

    @DisplayName("Проверка на cоответствие шаблону.")
    @MethodSource("initialArrays")
    @ParameterizedTest
    void checkOneTwo2(int[] arr) {
        assertTrue(checkOneTwo(arr));
    }

}