/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_vista_controlador;

 import Logica.Operaciones;
import  Vista.vista;
import Controlador.Control;
public class Modelo_vista_controlador {

    
    public static void main(String[] args) {
      Operaciones codigo = new Operaciones(0.0,0.0);
      vista grafico=new  vista();
      Control contro= new Control(grafico, codigo);
      contro.inicio();
      grafico.setVisible(true);
    }
    
}
