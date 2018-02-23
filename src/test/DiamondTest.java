package test;
import com.pretwu.Diamond;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest {
    Diamond d;

    @BeforeEach
    void setUp() {
        d = new Diamond();
    }

    @Test(expected=NullPointerException.class)
    public void isosceles() {
        assertEquals("", d.drawIsosceles(), "well");
    }
}