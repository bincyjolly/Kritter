package kritter.testng;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class Testng {

    @Test(priority = 1)
    public void testAdd () {
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
        System.out.println(str);
    }
    @Test(priority = 2)
    public void oneMoreTest() {
        System.out.println("This is a TestNG-Maven based test");
    }
}

