/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poep1;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kuveshanpillay
 */
public class MethodTest {
    
    public MethodTest() { }
//Step 1 - Create an object from the Login class / class being tested
    Method login = new Method();
    
   //Step 2 - Send through the test data into the below methods
    //test data is in the poe document
    
    @Test //make sure test method is descriptive of the check being done
    public void testCheckUserNameCorrectlyFormatted() 
    {
        boolean actual = login.checkUserName("Kyl_1"); //test good data being checked
        assertTrue(actual);
    }
    
    @Test
    public void testCheckUserNameInCorrectlyFormatted() 
    {
        boolean actual = login.checkUserName("kyl!!!!!"); //test bad data being checked
        assertFalse(actual);     
    }

    @Test //checks the good password data
    public void testCheckPasswordComplexitySuccess() {
        
       String username = "Ch&&sec@ke99!";
       
        boolean actual = login.CheckPasswordcomplexity(username);
        assertTrue(actual);
    }
    
    @Test //checks the bad password data
    public void testCheckPasswordComplexityFail() {
        boolean actual = login.CheckPasswordcomplexity("password");
        assertFalse(actual);
    }
}
