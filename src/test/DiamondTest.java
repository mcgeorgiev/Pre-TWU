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
    public void isoscelesOne() {
        String oneTriangle = "*\n";
        assertEquals(oneTriangle, d.drawIsosceles(1));
    }

    @Test()
    public void isoscelesThree() {
        String threeTriangle = "  *  \n *** \n*****\n";
        assertEquals(threeTriangle, d.drawIsosceles(3));
    }

    @Test()
    public void diamondThree() {
        String threeDiamond = "  *  \n *** \n*****\n *** \n  *  \n";
        assertEquals(threeDiamond, d.drawDiamond(3));
    }

    @Test()
    public void diamondOne() {
        String oneDiamond = "*\n";
        assertEquals(oneDiamond, d.drawDiamond(1));
    }

    @Test()
    public void diamondFour() {
        String fourDiamond = "   *   \n  ***  \n ***** \n*******\n ***** \n  ***  \n   *   \n";
        assertEquals(fourDiamond, d.drawDiamond(4));
    }

    @Test()
    public void diamondName() {
        String nameDiamond = "  *  \n *** \nMichael\n *** \n  *  \n";
        assertEquals(nameDiamond, d.drawDiamondName(3, "Michael"));
    }

}