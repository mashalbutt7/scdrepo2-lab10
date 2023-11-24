/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mashalbutt
 */
public class CalculatorJUnitTest 
{
    
    public CalculatorJUnitTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    void testAddition() 
    {
        assertEquals(3, addition.add(1, 2));
        assertEquals(3.4, addition.add(1.2, 2.2), 0.0001);
        assertEquals("6", addition.add("2", "4"));
        assertEquals(6, addition.add(new int[]{1, 2, 3}));
        assertEquals("6", addition.add(new String[]{"1", "2", "3"}));
    }

    @Test
    void testSubtraction() 
    {
        assertEquals(-1, subtraction.subtract(1, 2));
        assertEquals(-1.2, subtraction.subtract(1.0, 2.2), 0.0001);
        assertEquals("-2", subtraction.subtract("2", "4"));
    }

    @Test
    void testMultiplication() 
    {
        assertEquals(2, multiplication.multiplicatio(1, 2));
        assertEquals(2.88, multiplication.multiplicatio(1.2, 2.4), 0.0001);
        assertEquals("8", multiplication.multiplicatio("2", "4"));
        assertEquals(6, multiplication.multiplicatio(new int[]{1, 2, 3}));
        assertEquals("6", multiplication.multiplicatio(new String[]{"1", "2", "3"}));
    }

    @Test
    void testDivision()
    {
        assertEquals(0.5, division.divide(1, 2), 0.0001);
        assertEquals(0.4167, division.divide(1.0, 2.4), 0.0001);
        assertEquals("0.5", division.divide("2", "4"));
        assertEquals(0, division.divide(1, 0));
        assertEquals(0, division.divide(1.0, 0.0));
        assertEquals("invalid string", division.divide("2", "0"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
