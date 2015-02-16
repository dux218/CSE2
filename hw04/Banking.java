//Duo Xu     2015/2/14
//Homework Assignment 4
//program2

//import Scanner class
import java.util.Scanner;
//add class and main method
public class Banking {
    //main method required for every java program
    public static void main(String[] args){
    //made a random account
    int deposits=(int) (Math.random()*5001);
    
    
    //declare an instance of the Scanner object that will take input from STDIN
    Scanner input= new Scanner(System.in);
    // prompt users to make choice
    System.out.println("enter \"view\" to viewing your balance");
    System.out.println("enter \"save\" to depositing money");
    System.out.println("enter \"withdraws\" to withdrawing money ");
    //change users choice to char
    char option =input.next().charAt(0);
    
    //respond to different choices by using switch
    switch (option) {
       //viewing account
        case 'v' :{System.out.println("Your balance is :"+deposits+"$");
            break;
        }
       //saving money
        case 's' :{System.out.print("Enter the amount you want to save :");
                    int savings=input.nextInt();
                    if(savings>=0){
                        System.out.println("Transaction succeed.Your new balance is :"+(savings+deposits)+"$");
                    }
                    else {
                        System.out.println("Please enter a positive number.");
                    }
                    break;
                }
        //withdraw money
        case 'w' :{System.out.print("Your balance is :"+deposits+"$. Enter the number you want to withdraw :");
                    int withdrawings=input.nextInt();
                    if (withdrawings<=deposits){
                        System.out.print("Transaction succeed. Your new balance is :"+(deposits-withdrawings)+"$");
                    }
                    else if (withdrawings>deposits){
                        System.out.println("You do not have enough deposits.");
                    }
                    else {
                        System.out.println("Please enter a positive number.");
                    }
                    break;
        }
    }
    
    
    
    
    
    
       
    }
}