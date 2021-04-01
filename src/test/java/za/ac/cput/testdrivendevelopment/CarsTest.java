/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testdrivendevelopment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author 216040566 Waseem Dollie
 */
public class CarsTest {
    
    private Cars cars1;
    private Cars cars2;
    private Cars cars3;

    @BeforeEach
    public void setUpClass() {
        cars1 = new Cars();
        cars2 = new Cars();
        cars3 = cars1; 
    }

     //When tested its suppose to pass
     @Test
     public void testIdentity() {
        assertSame(cars1, cars3);
    }
     
     //When tested its suppose to pass
      @Test
     public void testEquality() {
        assertEquals(cars1, cars3);
    }
     
     //When tested its suppose to fail
      @Test
     public void testFail() {
         fail("The test will fail");
        assertEquals(cars1, cars3);
    }
     
     //Test Timeout is supposed to display error
      @Test
      @Timeout (10)       
      public void testTimeout() throws InterruptedException {
        while (true) {
            Thread.sleep(300);
    }
      }    
   
      //Test Disabling will skip the test
      @Test
      @Disabled("Disabling this test")      
      public void testDisable() {
       }
}   