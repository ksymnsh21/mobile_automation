package Assignment_1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("The retult of getLocalNumber is not 14", mainClass.getLocalNumber() == 14);
    }
}
