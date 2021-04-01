/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tdd;

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
 * @author 219019703 Uthmaan Dudley 
 */

public class variableTest {
    
    private variable name;
    private variable A;
    private variable B;

    @BeforeEach
    public void setUpClass() {
        name = new variables();
        A = new variables();
        B = variables; 
    }

     //Test must pass
     @Test
     public void testIdentity() {
        assertSame(name, B);
    }
     
     //Test must pass
      @Test
     public void testEquality() {
        assertEquals(name, B);
    }
     
     //Test must fail
      @Test
     public void testFail() {
         fail("test will fail");
        assertEquals(name, B);
    }
     
     //Display error
      @Test
      @Timeout (100)       
      public void testTimeout() 
throws InterruptedException {
        while (true) {
            Thread.sleep(300);
    }
      }    
   
      //Test Disable
      @Test
      @Disabled("Disable test")      
      public void testDisable() {
       }

