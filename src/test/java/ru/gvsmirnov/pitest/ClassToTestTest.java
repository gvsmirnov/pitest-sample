package ru.gvsmirnov.pitest;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gsmir
 *         Date: 03.03.12
 */
public class ClassToTestTest {
    @Test
    public void testThreshold() {

        ClassToTest classToTest = new ClassToTest(10.0);

        Assert.assertTrue(classToTest.threshold(11.0));
        Assert.assertFalse(classToTest.threshold(10.0));
    }
}
