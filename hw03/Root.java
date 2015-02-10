//Duo Xu     2015/2/6
//Write a program that prompts the user to enter a double and then 
//prints out a crude estimate of the cube root of the number 
//and the value of this crude guess when cubed.

//import Scanner class
import java.util.Scanner ;

//add the class and main mehod

public class Root {
    //main method required for every java program
    public static void main(String[] args) {
  
  //declare an instance of the Scanner object.
  Scanner input;
  input= new Scanner( System.in )  ;

  //now prompt the user to enter a double
  System.out.print("Enter a double :");
  //accept user input of the double      
  double nDouble= input.nextDouble() ;
  
  double guess1= nDouble/3  ;
  //then do 5 times the same calculations to increase accuracy
  double guess2=(guess1*guess1*guess1+nDouble)/(3*guess1*guess1) ;
  double guess3=(2*guess2*guess2*guess2+nDouble)/(3*guess2*guess2) ;
  double guess4=(2*guess3*guess3*guess3+nDouble)/(3*guess3*guess3) ;
  double guess5=(2*guess4*guess4*guess4+nDouble)/(3*guess4*guess4) ;
  double guess =(2*guess5*guess5*guess5+nDouble)/(3*guess5*guess5) ;
  
  //the cube of the final guess
  double cubeOfGuess=guess*guess*guess  ;
  
  //now print out the estimate root and the cube of the guess
  System.out.println("the crude estimate of the cube root of the number" +
  " is :"+guess+" and the value of this crude guess when cubed is :" +
  cubeOfGuess) ;


    }
    
}

