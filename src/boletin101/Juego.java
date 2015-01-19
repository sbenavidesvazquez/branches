
package boletin101;
//jooooooooodert
import javax.swing.JOptionPane;
/**
 *En esta clase se detallara la funcionalidad del programa
* @author sbenavidesvazquez
* @version 12/1/15A
 */

public class Juego {
    
    private int n,a,r,t;
    
    public Juego(){
        
    }
    
    public int intentos(){
        
        do{
        String dato=JOptionPane.showInputDialog("Introducir el número de intentos entre 1 y 10 incluidos");
        n=Integer.parseInt(dato);        
        }while(n<=0 || n>10);
        return n;
    }
    
    public int numero(){
        
        do{
        String dato=JOptionPane.showInputDialog("Introducir número para adivinar");
        a=Integer.parseInt(dato);
        }while(a<1 || a>50);
        return a;
        
    }
    
    public void adivinar(){
        
        for(t=1;t<=n && r!=a;t++){
            
            do{
            String dato=JOptionPane.showInputDialog("turno "+t+" Pon tu respuesta");
            r=Integer.parseInt(dato);
            if(r<a){
                JOptionPane.showMessageDialog(null, "Más alto");
                }
            if(r>a){
                JOptionPane.showMessageDialog(null, "Más bajo");
                }
            }while(r>50 || r<0);           
            
        }
    }
    
    public void fin(){
        if(r==a){
                JOptionPane.showMessageDialog(null, "Ganaste");
            }
            if(t>n){
                JOptionPane.showMessageDialog(null, "Perdiste");
            }
    }
    
}
