package exponent;
import javax.swing.*;
/**
 *
 * @author yemane
 */
public class Exponent {
    
  public static long exPonent( int e, int b){
     if ( e == 0 ) 
       return 1;
     return 
       b * exPonent( e-1, b);
  } 
  public static void main(String[] args) {
    String output = "";
    while ( true ){
     int exp = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Exponent e.g 13")); 
     int base = Integer.parseInt(JOptionPane.showInputDialog("\nEnter a base  e.g  2"));      
     long result = exPonent( exp, base );

     output += "\n " + base + "  ^  " + exp + "  =  " + result;     
     JOptionPane.showMessageDialog(null, output);   
    }
  } 
}

    

