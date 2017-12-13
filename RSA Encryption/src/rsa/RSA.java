package rsa;
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.math.BigInteger;
import java.io.DataInputStream;

/**
 *
 * @author yemane Zewdu
 * Data Structures
 ** RSA Encryption and decryption
 * 12/12/2017
 */
public class RSA {

    /**
     * @param args the command line arguments
     */
    private BigInteger e, n, d;   // the two public keys and the private key respectively 
    private BigInteger p, q; // the two prime numbers
    private int  bitlength = 1024;
    private Random rand;     
    private BigInteger phi;      // Euler totient function
        
        public RSA(){               // default constructor
            rand = new Random();
             q = BigInteger.probablePrime(bitlength, rand);    // finding the prime number
             p = BigInteger.probablePrime(bitlength, rand);     //   ""    ""   ""     ""
             n = p.multiply(q);                             // n = p * q
             
             // phi = (p-1)(q-1)
             phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE)); 
             
             // e (the exponent for the encryption formula) is usually a small number greater than 2
             e = BigInteger.probablePrime(bitlength / 2, rand);
             
             // while this is true...
             while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0){
             
             e.add(BigInteger.ONE);  // add the exponent
             
             }
             // d (the exponent for the decryption formula) is calculated as the inverse of 'e' mod 'phi'
             d = e.modInverse(phi);      
                
        
        }
        public RSA(BigInteger exp, BigInteger D, BigInteger N)
            {
                e = exp;
                d = D;
                n = N;
            }
  
        private static String btToStr(byte[] encrypted) {   // function that changes bytes to string   
    
        String bytesToString = "";
        for (byte bt : encrypted)
        {
            bytesToString = bytesToString + Byte.toString(bt);
        }
        return bytesToString;
        }
                                            
        public byte[] encrypt(byte[] message)                // Encrypting function
        {
                // encrypting formula-> c = m^e mod n 
            return (new BigInteger(message)).modPow(e, n).toByteArray();
        }


        public byte[] decrypt(byte[] message)               // Decrypting function
        {
                // decrypting formula-> m = c^d mod n  
            return (new BigInteger(message)).modPow(d, n).toByteArray();
        }

       public static void main(String[] args) {
        // TODO code application logic here
        
            RSA rsa = new RSA();
            DataInputStream in = new DataInputStream(System.in);
            Scanner userInput =  new Scanner(System.in);

            System.out.println("Enter your message:\n");
           String text = userInput.nextLine();                  // getting the user's message

            System.out.println("Encrypting your message!");
            System.out.println("Your messages is "  + btToStr(text.getBytes()) + "  in bytes.\n");

                    // encrypting
            byte[] encrypted = rsa.encrypt(text.getBytes());      // function call

                     // decrypting
            byte[] decrypted = rsa.decrypt(encrypted);         //     ""     ""

            System.out.println("Processing... " + "Please wait!");      // :))
            System.out.println("Almost done!\n");

            System.out.println("Your decrypted messages is " + btToStr(decrypted) + "  in bytes.");
            System.out.println("Decrypted message: " + new String(decrypted));    // function call
        }
    
     
}
