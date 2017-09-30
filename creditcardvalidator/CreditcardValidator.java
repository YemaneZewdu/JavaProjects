package creditcardvalidator;
import javax.swing.*;import java.util.Scanner;

public class CreditcardValidator {
 
  
         public static int computeEvenSqrd( String cd , int ln ){      
          int sumEvenSqrd = 0;
          int index = 2 ;
          char ch;         

          while ( index <=  ln ){                
           ch = cd.charAt(ln - index);        
           int digit = (int) (ch - '0');            
           int xy = 2 * digit;            

            if  ( xy >= 10 ){            
              sumEvenSqrd = sumEvenSqrd + xy%10;    
             sumEvenSqrd = sumEvenSqrd + xy/10;               

        }else {                       
                sumEvenSqrd = sumEvenSqrd + xy;            
       System.out.println("\ndoubling every second digit   " + (2 * digit ));  
    }                
     index += 2;  
   }         
     return sumEvenSqrd; 
}
    public static int computeOddNumSum(String cd, int ln){
    int sumOddNum = 0;
    char ch;
    int index = 1;
   
    while (index <= ln){
    ch = cd.charAt(ln-index);
    int digit = (int) (ch - '0');
    sumOddNum += digit;
    index += 2;    
    }      
    return sumOddNum;
    }
    
    public static double Sum(int even, int odd){     
        return even + odd; 
    }     
    public static boolean ValidityCheck(double LastSum){
     boolean check; 
      if (LastSum / 10.0 == 0)
      check = true;
      else {
       check = false;
        }
      return check;
    } 
     public static void main(String[] args) {    
                //String credit  = "4388576018402626";         
              Scanner userInput =  new Scanner(System.in);
              System.out.println("\nEnter a credit card number: ");
              String credit = userInput.nextLine();
               

            int length = credit.length();           
              
            System.out.println("\n\nThe Number of digits in the Credit Card is" + length);
            System.out.println("\n\nThe The Credit Card Number is   " + credit);
         
     int EvenNumbersSqrd = computeEvenSqrd( credit, length);      
     int OddNumbersSum = computeOddNumSum(credit, length);
    double finalSum = Sum(EvenNumbersSqrd, OddNumbersSum);
     boolean valid = ValidityCheck(finalSum);
       
     System.out.println("\nThe Sum of the even digits squared is  " + EvenNumbersSqrd);
     System.out.println("\nThe sum of the odd place digits is " + OddNumbersSum);

        if (valid == true)
            System.out.println("\nThe credit card you entered is valid");
          //  output += ;
        else {
            System.out.println("\nThe credit card you entered is invalid\n");
                           
    }
     }
}
