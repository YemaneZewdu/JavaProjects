package hailstonesquence;

import java.util.Scanner;
public class HailStoneSquence {
//  @author yemane 
    public static int Sequence (int n){
        int i=0;
       do {
           if ((n%2)==0){              
               System.out.println( n + " an even number so we take the half " + n/2 );
               n= n/2;               i++;
           }
           else if ((n%2)!=0){              
               System.out.println( n + " is an odd number, so make it 3n+1" + (3*n+1));
                n= 3*n + 1;
               i++;
           }
           if (n==1){
            System.out.println("\n\t It took " + i + " steps to reach 1");           
           }                                
           } while (n!=1);
        return n;
    }      
      public static void main(String args[]){       
      Scanner userInput = new Scanner(System.in);
      System.out.println("This is HailStone Squence Program.\nEnter a number:\n");
      int num = userInput.nextInt();
      Sequence(num); 

    }
}
