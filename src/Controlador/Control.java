
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
    
}
    }
}