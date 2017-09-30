/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zillercongerencealgorithm;
import javax.swing.JOptionPane;
/**
 *
 * @author yeman
 */
public class ZillerCongerenceAlgorithm {    

     public static String output="";    
    public static int Algorithm(int year, int month, int day){
      int h, m, j;
      year = year % 100;
      j = year / 100;
      m = (26*(month+1))/10;      
       h = (day + m + year + (year/4) + (j/4) + 5*j ) % 7;            
             switch(h){          
              case 0:                 
                  output += month + "/ " + day + "/ " + year + " is Saturday ";
                  break;
              case 1:                
                   output += month + "/ " + day + "/ " + year + " is Sunday ";
                  break;
              case 2:
                output += month + "/ " + day + "/ " + year + " is Monday ";
                  break;
              case 3:
                  output += month + "/ " + day + "/ " + year + " is Tuesday ";
                  break;
              case 4:
                  output += month + "/ " + day + "/ " + year + " is Wednsday ";
                  break;
              case 5:
                 output += month + "/ " + day + "/ " + year + " is Thursday ";
                  break;
              case 6:                 
                  output += month + "/ " + day + "/ " + year + " is Friday ";
                  break;
              default:
                  output += "Error! Please try again ";                  
                  break;          
          }     
              return h;
}
    public static void main(String[] args) {
        int q, m, k;      
       m = Integer.parseInt(JOptionPane.showInputDialog("Enter the month (from 1-12): "));
       q = Integer.parseInt(JOptionPane.showInputDialog("Enter the day of the month (from 1-31): "));            
       k = Integer.parseInt(JOptionPane.showInputDialog("Enter the year (eg. 2017): "));                              
        Algorithm(k, m, q);        
      JOptionPane.showMessageDialog(null, output);}
}
