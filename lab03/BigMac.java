//Duo Xu     2015/2/5
//Arithmetic Calculations and input
//Write a program that computes the cost of buying a some Big Macs.

//import Scanner class
import java.util.Scanner ;

//add the class and main method
public class BigMac {
    //main method required for every Java program
    public static void main(String[] args) {
        
//declare an instance of the Scanner object. 
Scanner myScanner;

//creating an instance that will take input from STDIN:
myScanner = new Scanner( System.in );

  //Now prompt the user for the number of tickets
  System.out.print("Enter the number of Big Macs(an integer > 0): ");
  //accept user input of the number of BigMacs
  int nBigMacs = myScanner.nextInt();
  //prompt the user for the cost per Big Mac
  System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");
  //accept user input of the cost per Big Mac
  double bigMac$ = myScanner.nextDouble();


  //prompt the user for the percent sales tax as a whole number
  System.out.print( "Enter the percent tax as a whole number (xx): ");
  //accept user input of the tex rate
  double taxRate = myScanner.nextDouble();
  //user enters percent, but I want proportion 
  taxRate/=100; 

  //print out the output in a pleasing format
  //first declare variables
    //total number of costs
    double cost$;
    //whole number of costs
    int dollars;
    //storing digits to the right of the decimal points
    int dimes ;
    int pennies;

  cost$ = nBigMacs*bigMac$*(1+taxRate);
  //get the number of dollars, dropping decimal fraction
  dollars=(int)cost$;
  //get the number of dimes 
  dimes=(int)(cost$*10)%10;
  //get the number of pennies
  pennies=(int)(cost$*100)%10;


System.out.println("The total cost of " +nBigMacs

 +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  

 " sales tax of "+ (int)(taxRate*100) + "%, is$"+dollars+"."+dimes+pennies);

     
     







  










        
        
        
    }
    
}
