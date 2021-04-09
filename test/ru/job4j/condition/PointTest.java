package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when0And1To1And3Then2Point23() {
        double expected = 2.23;
        int x1 = 0;
        int y1 = 1;
        int x2 = 1;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus2And3To1And4Then3Point16() {
        double expected = 3.16;
        int x1 = -2;
        int y1 = 3;
        int x2 = 1;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3AndMinus4ToMinus1And5Then9Point84() {
        double expected = 9.84;
        int x1 = 3;
        int y1 = -4;
        int x2 = -1;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}