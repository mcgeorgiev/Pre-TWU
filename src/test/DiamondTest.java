package test;
import com.pretwu.Diamond;

import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest {
    Diamond d;

    @Before
    public void init() {
        d = new Diamond();
    }

    @Test()
    public void isosceles() {

        String threeTriangle = "  *  \n *** \n*****\n";
        assertEquals(threeTriangle, d.drawIsosceles(3));

        String oneTriangle = "*\n";
        assertEquals(oneTriangle, d.drawIsosceles(1));
    }

    @Test()
    public void diamond() {
        String threeDiamond = "  *  \n *** \n*****\n *** \n  *  \n";
        assertEquals(threeDiamond, d.drawDiamond(3));
    }


}