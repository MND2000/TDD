package za.ac.cput.tdd;

//author: Kaylin De Wet 220025754

import static java.time.Duration.ofMinutes;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
    private App stuName1;
    private App stuName2;
    private App stuName3;
    
    @BeforeEach
    public void setUp() {
        stuName1 = new App();
        stuName2 = new App();
        stuName3 = stuName1;
    }
    
    //1. demonstrating object equality
    @Test
    public void testEquality() {
        assertEquals(stuName1, stuName3);
        System.out.println("Student names are equal");
    }

    //2. demonstrating object identity
    @Test
    public void testIdentity() {
        assertSame(stuName1, stuName3);
    }
    
    //3. demonstrating failing test
    @Test
    public void testGetStuName() {
        assertEquals(stuName1, stuName3);
        fail("The test case is a prototype.");
    }
    
    //4. demonstrating timeouts
    @Test
    public void timeoutNotExceeded() 
    {

        assertTimeout(ofMinutes(3), () -> {

        });
    }
    
    //5. demonstrating disabling test
    @Ignore
    @Test
    public void testGetStuSurname() {
        assertEquals(stuName1, stuName3);
       
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
