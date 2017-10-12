package bnsrch;
import javax.swing.*;
/**
 *
 * @author yemane
 */
public class Bnsrch {  

    public static boolean bnSearch( int a[], int val, int low, int high ){
        
        if ( low > high ) return false;
        
        int mid = ( low + high ) / 2;
        // shorter 
       // return ( ( val == a[mid]) ? true : ( val > a[mid]) ? bnSearch(a, val, mid+1, high)
       //         : bnSearch( a, val, low, mid -1));
        if ( val == a[mid]){
            return true;
        }else if ( val > a[mid]){
               return  bnSearch( a, val, mid + 1, high);
            }else {
               return bnSearch( a, val, low, mid - 1);
            }
    }
    public static void main(String[] args) {
      String output = ""; 
      while ( true ){
      int [] num = { 12, 31, 45, 55, 64, 68, 77, 79, 88, 89, 99, 101};
      int low = 0;   
      int high = num.length  - 1;
      int val = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an integer e.g. 64"));
      boolean flag = bnSearch ( num, val, low, high);
      if ( flag == true ){
          output += "\nThe value  " + val + "  is in the List ";
      }else {
          output += "\nThe value  " + val + "  is not in the List";
      }
      JOptionPane.showMessageDialog(null, output);
    }
    }  
}
