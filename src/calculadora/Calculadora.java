/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author ivan
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    float sumar(float a, float b){
        return a +b;
    }
    
    float restar(float a, float b){
         if (a==0){
            System.out.print("no se puede restar");
            return 0;
        }  
        return a - b;
    }
    
    float multiplicacion(float a, float b){
        
        return a * b;
        
    }
    
    float division(float a, float b){
        if (b==0){
            System.out.print("no se puede dividir");
            return -1;
        }  
        return a / b;
    }
    
    double potencia(double a, double b){
        return Math.pow(a, b);
    }
    
    string sms(string sms){
        return "*" + sms + "*";
        
    }
   
}
