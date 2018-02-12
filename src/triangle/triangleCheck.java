/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author alexa
 */
public class triangleCheck {

    public triangleCheck() {
    }
    
    
    
    public void check(int a, int b, int c){
    
        if(a<= 0 || b<=0 || c<=0){
            System.out.println("NOPE!!!");
        }
        else if(a==b && b==c){
            System.out.println("Equilateral");
        }
        else if((a==b && b!=c)||(a==c && a!=b)||(b==c && b!=a)){
            System.out.println("Isoceles");
        }
        else System.out.println("Scalene");
        
    }
    
}
