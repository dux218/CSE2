//Duo Xu   2015/2/27
//hw06: Getting Loopy  Program1:

//import Scanner class
import java.util.Scanner ;

//add class and main method
public class GetIntegers{
    //main method required for every java program
    public static void main(String[] args){
        //declare sum variable "sum" and count variable
        int sum=0 ;//count=1  ;
        
        //prompt user to enter 5 non-negative integers 
        System.out.println("Please enter 5 non-negative integers: ");
        
        for (int count=1;count<=5;){
            //declare an instance of the Scanner object that will take input from STDIN
            Scanner input= new Scanner (System.in);
           
            
            
            //examine whether the input is valid
            if(input.hasNextInt()){
                int m= input.nextInt();
                if (m>=0){
                    //accumulat the input
                sum +=m  ;
                //count valid counts
                count=count+1 ;
                }
                else {
                    //ask the user to enter again
                    System.out.println("Invalid input, enter again");
                }
                
            }
            //ask the user to enter again
            else{
               System.out.println("Invalid input, enter again");
            }
            
    
        }
        //print the output
        System.out.println("Sum is "+sum);
    }
}

