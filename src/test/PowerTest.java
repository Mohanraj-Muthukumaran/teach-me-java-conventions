package powerpackage;


import org.junit.Test;
import org.junit.Assertions;
import static org.junit.Assert.assertEquals;

public class PowerTest {
    @Test
    public void onePowerOneIsOne() {
        Assertions.assertEquals(Power.find(1,1),1);
    }

    @Test
    public void twoPowerOneIsTwo() {
        Assertions.assertEquals(Power.find(2,1),2);
    }

    @Test
    public void twoPowerTwoIsFour() {
        Assertions.assertEquals(Power.find(2, 2),4);
    }

    @Test
    public void threePowerTwoIsSix() {
        Assertions.assertEquals(Power.find(3, 2),3*3);
    }
}
