package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    @Test
    void shouldFindGcdAndLcm_OK() {
        final Exercise01 exercise01 = new Exercise01();
        // GCD tests
        assertEquals(6, exercise01.findGcd(48, 18));
        assertEquals(14, exercise01.findGcd(56, 98));
        assertEquals(1, exercise01.findGcd(101, 10));
        assertEquals(5, exercise01.findGcd(0, 5));
        assertEquals(5, exercise01.findGcd(5, 0));
        assertEquals(0, exercise01.findGcd(0, 0));

        // LCM tests
        assertEquals(20, exercise01.findLcm(4, 5));
        assertEquals(21, exercise01.findLcm(7, 3));
        assertEquals(0, exercise01.findLcm(0, 5));
        assertEquals(0, exercise01.findLcm(5, 0));
        assertEquals(0, exercise01.findLcm(0, 0));
    }
}
