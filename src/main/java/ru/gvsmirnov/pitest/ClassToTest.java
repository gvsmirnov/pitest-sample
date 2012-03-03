package ru.gvsmirnov.pitest;

/**
 * @author gsmir
 * Date: 03.03.12
 */
public class ClassToTest {

    private static final double THRESHOLD = 10.0;
    
    private ClassToTest(){}
    
    public static boolean threshold(double value) {
        return value >= THRESHOLD;
    }
    
}
