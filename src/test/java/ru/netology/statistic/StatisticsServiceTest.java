package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {
// Базовая проверка
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    //Тестируем граничное значение
    @Test
    void findMaxZero() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0,0,0};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    //Тестируем граничное значение
    @Test
    void findMaxOne() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0,1,0};
        long expected = 1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    //Тестируем граничное значение
    @Test
    void findMaxUnderLimit() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 9223372036854775807L, 12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 9223372036854775807L;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    //Тестируем класс эквивалентности - Самое крупное число отрицательное
    @Test
    void findMaxNegative() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, -21, 12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    //Тестируем граничное значение
    @Test
    void findMaxBoun() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, -21, 9223372036854775806L, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 9223372036854775806L;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}