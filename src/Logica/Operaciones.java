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
    
     public double divi(double a, double b) {
      if (b == 0) {
         throw new ArithmeticException("División por cero");
      }
      return a / b;
   }
   
public double seno(double a) {
    double radianes = Math.toRadians(a);
    return Math.sin(radianes);
}

public double coseno(double a) {
    double radianes = Math.toRadians(a);
    return Math.cos(radianes);
}

public double tangente(double a) {
    double radianes = Math.toRadians(a);
    return Math.tan(radianes);
}

   public double potencia(double a, double b) {
      return Math.pow(a, b);
   }

   public double logaritmo(double a) {
      return Math.log(a);
   }

   public double arcseno(double a) {
      double radianes = Math.toRadians(a);
      return Math.asin(radianes);
   }

   public double arccoseno(double a) {
      double radianes = Math.toRadians(a);
      return Math.acos(radianes);
   }

   public double arctangente(double a) {
      double radianes = Math.toRadians(a); 
      return Math.atan(radianes);
   }
   
   public double raiz(double a, double b) {
      return Math.pow(a, 1.0 / b);
   }
  
   public double cotangente(double a) {
      double radianes = Math.toRadians(a);
      return 1.0 / Math.tan(radianes);
   }

   public double cosecante(double a) {
      double radianes = Math.toRadians(a);
      return 1.0 / Math.sin(radianes);
   }
 
   public double secante(double a) {
      double radianes = Math.toRadians(a);
      return 1.0 / Math.cos(radianes);
   }
   
   public long factorial(int a) {
       long resultado = 1;
       for (int i = 2; i <= a; i++) {
            resultado *= i;
       }
       return resultado;
   }

   public long permutaciones(int a, int b) {
      return factorial(a) / factorial(a - b);
   }

   public long combinaciones(int n, int k) {
      return factorial(n) / (factorial(k) * factorial(n - k));
   }
}
    

