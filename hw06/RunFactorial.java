//Duo Xu  2015/2/27
//hw06: Getting Loopy  Program2

//import Scanner class
import java.util.Scanner;

//add class and main method
public class RunFactorial {
    //main method required for every java program
    public static void main(String[] args){
        //initialize count and factorial value
        int count=1;  int factorial=1 ;
        // use to determine whether it is an integer
        boolean determinant1;
        
        //prompt the user to enter an integer between 9 and 16
        System.out.println("Please enter an integer that is between 9 and 16:");
        //loop condition used to repetitively asked the user to input value if the input was invalid
        while (count==1){
            
            //declare an instance for the Scanner class that take input from the STDIN
            Scanner input= new Scanner(System.in);
            //examine input is Int or not
            determinant1=input.hasNextInt();
            
            
            if(determinant1==true){
                //cast input to integer
                int number1=input.nextInt();
                //cast again used to print the initial value later
                int number2=number1;
                //examine whether the number is between 9 and 16
                if(number1>=9&number1<=16){
                    //loop condition
                    while (number1>=1){
                        //calculate factorial
                        factorial *= number1;
                        //"numer1"-1 means the previous value had been timed to the factorial
                        number1--;
                        //stop the loop if the input is valid
                        count++;
                    }
                    //print the outcome
                    System.out.println("Input accepted:");
                    System.out.println(number2+"!="+factorial);
                }
                //prompt the user to enter again
                else{
                    System.out.println("Invalid input, enter again!");
                }
            }
            //prompt the user to enter again
            else {
                System.out.println("Invalid input, enter again!");
                
            }
        }
        
    }
}

