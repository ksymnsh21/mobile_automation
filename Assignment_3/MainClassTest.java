package Assignment_3;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetClassString() {
        Assert.assertTrue("hello or Hello substrings are not found in getClassString return value",
                mainClass.getClassString().indexOf("hello") != -1 || mainClass.getClassString().indexOf("Hello") != -1);
    }
}
