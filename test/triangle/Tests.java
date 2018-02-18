/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author alexa
 */
public class Tests {
    
    public Tests() {
        
    }
    public triangleCheck check = new triangleCheck();
    
    @Test public void scal(){
    
        Assert.assertTrue(check.check(7, 8, 9).equals("Scalene"));
        
    }
    @Test public void isoc(){
    
        Assert.assertTrue(check.check(7, 7, 9).equals("Isoceles"));
        
    }
    @Test public void equi(){
    
        Assert.assertTrue(check.check(7, 7, 7).equals("Equilateral"));
        
    }
    @Test public void nope(){
    
        Assert.assertTrue(check.check(77, 8, 9).equals("NOPE!!!"));
        
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
