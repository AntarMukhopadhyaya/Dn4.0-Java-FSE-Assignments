package org.dn4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AssertionTest {
    @Test
    public void testAssertTrue(){
        assertEquals(2,1+1);
        assertTrue(5 > 3);
        assertFalse(10 < 9);
        assertNull(null);
        assertNotNull(new String("Hello"));
        assertNotEquals(5, 10 + 5);
    }
}
