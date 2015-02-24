//Duo Xu    2015/2/6
//Write a program that prompts the user to enter a double and  then prints out 
//the first four digits to the right of the decimal point.

//import Scanner class
import java.util.Scanner ;

//add the class and main method
public class FourDigits {
    //main mehod required for every java program
    public static void main(String[] args) {

//declare an instance of the Scanner object
Scanner input ;

//create an instance that will take input from STDIN
input = new Scanner ( System.in ) ;

//now prompt the user for the double
System.out.print("Enter a double and I display the four digits to " +
"the right of the decimal point-") ;
double nDouble= input.nextDouble() ;

//then try to get the first four decimal point
//the way is to let the input times 10000 and transfer to integer and then 
//subtract the (tranfer the input into integer and times 10000)

//first casting
double nDouble1=nDouble*10000;
int nCasting1= (int) nDouble1;

//second casting
int nCasting2= (int) nDouble ;
int nCasting3= nCasting2*10000;

//then calculate the first four decimal points
int nFourDecimalPoints=nCasting1-nCasting3 ;

//then prints out the first four digits to the right of the decimal point.

if (nFourDecimalPoints<10000 && nFourDecimalPoints>999){
    System.out.println(nFourDecimalPoints) ;
}
if (nFourDecimalPoints<1000&& nFourDecimalPoints>99){
    System.out.println("0"+nFourDecimalPoints) ;
}
if (nFourDecimalPoints<100&& nFourDecimalPoints>9){
    System.out.println("00"+nFourDecimalPoints) ;
}
if (nFourDecimalPoints<10&& nFourDecimalPoints>=0){
    System.out.println("000"+nFourDecimalPoints);
}

    }
}

