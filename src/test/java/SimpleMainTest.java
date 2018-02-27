import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class SimpleMainTest {

    private SimpleNumber simpleNumber;
    private List<Integer> readyArray = new ArrayList<Integer>();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("");
        System.out.println("Before SimpleMain.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("");
        System.out.println("After SimpleMain.class");
    }

    @Before
    public void initTest() {
        System.out.println("");
        System.out.println("initTest()");
        simpleNumber = new SimpleNumber();
        readyArray.add(1);
        readyArray.add(2);
        readyArray.add(3);
        readyArray.add(5);
        readyArray.add(7);
    }

    @After
    public void afterTest() {
        System.out.println("afterTest()");
        simpleNumber = null;
    }

    @Test
    public void testGetSimpleNumber() throws Exception {
        System.out.println("testGetSimpleNumber()");
        assertEquals(readyArray, simpleNumber.getSimpleNumber(10));
        System.out.println("");
    }
}