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
    
    /**
     *
     * @param a
     * @param b
     * @param c
     */
    public String check(int a, int b, int c){
    
        if(a<= 0 || b<=0 || c<=0||a>= b+c || b>=c+a||c>=a+b){
            return "NOPE!!!";
        }
        else if(a==b && b==c){
            return "Equilateral";
        }
        else if((a==b && b!=c)||(a==c && a!=b)||(b==c && b!=a)){
            return "Isoceles";
        }
        else return "Scalene";
        
    }
    
}
