package arrays;
import javax.swing.JOptionPane;

public class Arrays {
    public static String output = "";
  public static int aboveAverage( int a[], double avg ){
      int kntr = 0;
      for ( int index = 0; index < a.length; index++ ){
          if ( a[index] > avg ){
              output += "    " + a[index];
              kntr++;
          }
      }
      return kntr;
  }
  public static double compute_Sum( int [] a ){
      double sum = 0;
      output += "\nThe elements above the average ";
      for ( int index = 0; index < a.length; index++){
          sum = sum + a[index];
      }
      return (sum / a.length);
  }
 
  public static void main(String[] args) {
   
      int [] number = {23,22,12,55,6,45,65,89,90,46,78,22,21,87,66,32,31,47,24,51};
      
      double average = compute_Sum( number );
      output += "\nThe average of the array elements is   " +  average + "\n";
      int kntr = aboveAverage ( number , average );
      output += "\n\nThe number of elements above the average  " + kntr + "\n";
   
      JOptionPane.showMessageDialog(null, output);
  }
    
}
