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
        Assert.assertTrue(ClassToTest.threshold(10.0));
        Assert.assertFalse(ClassToTest.threshold(9.0));
    }
}
