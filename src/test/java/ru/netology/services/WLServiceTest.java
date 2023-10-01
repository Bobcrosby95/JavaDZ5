package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WLServiceTest {

    @Test
    void shouldCalculateWorkList() {
        WLService service = new WLService();

        long income = 10000;
        long expenses = 3000;
        long threshold = 20000;
        long expected = 3;

        long actual = service.calculate((int) income, (int) expenses, (int) threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateWorkList2() {
        WLService service = new WLService();

        long income = 100000;
        long expenses = 60000;
        long threshold = 150000;
        long expected = 2;

        long actual = service.calculate((int) income, (int) expenses, (int) threshold);

        Assertions.assertEquals(expected, actual);
    }
}


