package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenPerimeter6Coefficient2Then2() {
        int inputPerimeter = 6;
        double inputK = 2;
        double expected = 2;
        double out = SqArea.square(inputPerimeter, inputK);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPerimeter8Coefficient1Point2Then3Point96() {
        int inputPerimeter = 8;
        double inputK = 1.2;
        double expected = 3.96;
        double out = SqArea.square(inputPerimeter, inputK);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPerimeter35Coefficient3Point1Then56Point47() {
        int inputPerimeter = 35;
        double inputK = 3.1;
        double expected = 56.47;
        double out = SqArea.square(inputPerimeter, inputK);

        Assert.assertEquals(expected, out, 0.01);
    }
}