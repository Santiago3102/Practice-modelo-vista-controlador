
package Controlador;

import   Vista.vista;
import  Logica.Operaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Control  implements ActionListener {

    vista grafico;
    Operaciones codigo;

    public Control(vista grafico, Operaciones codigo) {
        this.grafico = grafico;
        this.codigo = codigo;
        this.grafico.caja.addActionListener(this);
        this.grafico.caja1.addActionListener(this);
        this.grafico.result.addActionListener(this);
        this.grafico.suma.addActionListener(this);
        this.grafico.rest.addActionListener(this);
        this.grafico.mul.addActionListener(this);
        this.grafico.div.addActionListener(this);
        this.grafico.cos.addActionListener(this);
        this.grafico.sin.addActionListener(this);
        this.grafico.tan.addActionListener(this);
        this.grafico.arcos.addActionListener(this);
        this.grafico.arsen.addActionListener(this);
        this.grafico.artan.addActionListener(this);
        this.grafico.com.addActionListener(this);
        this.grafico.cot.addActionListener(this);
        this.grafico.csc.addActionListener(this);
        this.grafico.fact.addActionListener(this);
        this.grafico.log.addActionListener(this);
        this.grafico.per.addActionListener(this);
        this.grafico.pi.addActionListener(this);
        this.grafico.pot.addActionListener(this);
        this.grafico.raiz.addActionListener(this);
        this.grafico.sec.addActionListener(this);
    }
        public void inicio()
        {
        grafico.setTitle(" MODELO VISTA CONTRLADOR ");
        grafico.setVisible(true);
        grafico.setLocationRelativeTo(grafico);
        }
        
    
    @Override
    public void actionPerformed(ActionEvent ae) {
     JButton boton= (JButton)  ae.getSource();
    String op=boton.getText();
    
    switch (op){   
    case"+": {Double  x=codigo.suma(Double.parseDouble(grafico.caja.getText()),Double.parseDouble(grafico.caja1.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"-": {Double  x=codigo.resta(Double.parseDouble(grafico.caja.getText()),Double.parseDouble(grafico.caja1.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"*": {Double  x=codigo.multi(Double.parseDouble(grafico.caja.getText()),Double.parseDouble(grafico.caja1.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"/": {Double  x=codigo.divi(Double.parseDouble(grafico.caja.getText()),Double.parseDouble(grafico.caja1.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"sin": {Double  x=codigo.seno(Double.parseDouble(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"cos": {Double  x=codigo.coseno(Double.parseDouble(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"tan": {Double  x=codigo.tangente(Double.parseDouble(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"log": {Double  x=codigo.logaritmo(Double.parseDouble(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"arsen": {Double  x=codigo.arcseno(Double.parseDouble(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"arcos": {Double  x=codigo.arccoseno(Double.parseDouble(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"artan": {Double  x=codigo.arctangente(Double.parseDouble(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"cot": {Double  x=codigo.cotangente(Double.parseDouble(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"csc": {Double  x=codigo.cosecante(Double.parseDouble(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"sec": {Double  x=codigo.secante(Double.parseDouble(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"!": {long  x=codigo.factorial(Integer.parseInt(grafico.caja.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"^": {Double  x=codigo.potencia(Double.parseDouble(grafico.caja.getText()),Double.parseDouble(grafico.caja1.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"sqtr": {Double  x=codigo.raiz(Double.parseDouble(grafico.caja.getText()),Double.parseDouble(grafico.caja1.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"nPr": {long  x=codigo.permutaciones(Integer.parseInt(grafico.caja.getText()),Integer.parseInt(grafico.caja1.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case"nCr": {long  x=codigo.combinaciones(Integer.parseInt(grafico.caja.getText()),Integer.parseInt(grafico.caja1.getText()));
                         grafico.result.setText(String.valueOf(x));
                       }
    break;
    case "π":  // Asignar el valor de Pi
            grafico.caja.setText(String.valueOf(Math.PI));
}
    }
}