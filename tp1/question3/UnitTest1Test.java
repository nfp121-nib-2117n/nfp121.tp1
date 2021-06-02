package question3;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class UnitTest1Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UnitTest1Test
{
    /**
     * Default constructor for test class UnitTest1Test
     */
    public UnitTest1Test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    
    /**
     *  Test to lower case method of UnitTest1 class
     */
    @Test
    public void testToLowerCase()
    {
        question3.UnitTest1 unitFirstTest = new question3.UnitTest1();
        assertEquals(unitFirstTest.nameToLowerCaseTest("LAMA"), "lama");
    }

    /**
     * Test to sample method of UnitTest1 class
     */
    @Test
    public void testSampleMethod()
    {
        question3.UnitTest1 unitSecondTest = new question3.UnitTest1();
        assertEquals(unitSecondTest.sampleMethod(123112), 123112);
    }
}


