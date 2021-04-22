package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayThen1() {
        String name = "Monday";
        int expected = 1;
        int actual = MultipleSwitchWeek.numberOfDay(name);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSredaThen3() {
        String name = "Среда";
        int expected = 3;
        int actual = MultipleSwitchWeek.numberOfDay(name);
        assertEquals(expected, actual);
    }

    @Test
    public void whenNotDayOfWeekThenMinus1() {
        String name = "Hello";
        int expected = -1;
        int actual = MultipleSwitchWeek.numberOfDay(name);
        assertEquals(expected, actual);
    }
}