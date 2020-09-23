
package arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Clasearrays {
    
    ArrayList<Integer>enteros= new ArrayList();

public Clasearrays(){
    //constructor
}    

public void agregarDatos(int a){
    enteros.add(a);
}
public void mostrarArreglo(){
    for (int i = 0; i < enteros.size(); i++){
        JOptionPane.showMessageDialog(null, "Numero de posicion "+i+" es = "+enteros.get(i));
       
  
    }
  }
}
