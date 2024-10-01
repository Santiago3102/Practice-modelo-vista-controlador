/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author GUILLO
 */
public class Operaciones {
   private   double a,b; 
void Operaciones(){};
    public Operaciones(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public double suma (double a , double b)
    { return a+b;
      }
    
    public double resta (double a , double b)
    { return a-b;
      }
    
    public double multi (double a , double b)
    { return a*b;
      }
    
    public double divi (double a , double b)
    { return a/b;
      }
    
}
