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
 * @author Ravaughn
 */
public class HouseTest {
   
    private House house1;
    private House house2;
    private House house3;
    
    @BeforeEach
    public void setUp() {
        house1 = new House();
        house2 = new House();
        house3 = house1;
    }
    
    //Object Identity tested
    @Test
    void testIdentity () {
        assertSame(house1, house3);
    }
    
    //Object Equality tested
    @Test 
    void testEquality () {
        assertEquals(house1, house3);
    }
    
    //Test deliberately failed
    @Test
    public void testGetId() {
        System.out.println("getId");
        House instance = new House();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        fail("This test was failed deliberately.");
    }
    
    //Test Timeout
    @Test
    @Timeout (10)
    public void testTimeout() throws InterruptedException {
        while (true) {
            Thread.sleep(300);
        }
    }
    
    //Test Disabled
    @Test
    @Disabled("Disables this test")
    public void testDisabled() {
        
    }
   
}