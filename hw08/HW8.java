//Duo Xu   2015/3/19   Spring 2015, Homework Assignment
//[CSE2] hw08: MG’s Adventure World

import java.util.Scanner;

public class HW8 {
    

public static void main(String[] args) {

        char option;
   
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");

        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        // method4
        String input = getInput(scan, "Cc");

        System.out.println("You are in a dead valley.");

        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        //method4
        input = getInput(scan, "Cc");

        System.out.println("You walked and walked and walked and you saw a cave!");
        //print cave
        cave();

        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        //method4
        input = getInput(scan, "Cc");

        System.out.println("You entered a cave!");

        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        //method4
        input = getInput(scan, "Cc");

        System.out.println("Unfortunately, you ran into a GIANT!");
        //print Giant
        giant();

        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        //method5
        input = getInput(scan, "AaEe", 10);

        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");

        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        //print box
        box();
        //method6
        input = getInput(scan);

        System.out.println("Hero! Have a good day!");

    }

//start homework

//method6

public static String getInput(Scanner scan) {
if (scan.hasNextInt()){
int choiceBox=scan.nextInt();
switch (choiceBox){
    case 1  : System.out.println("It is a golden sword! Have a good day!");
              break;
    case 2  : System.out.println("It is GPA4.00Hero! Have a good day!");
              break;
    case 3  : System.out.println("It is a golden shield! Have a good day!");
              break;
    default : System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
    
}

}
else {
    System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
}
return "";

}

//method5
public static String getInput(Scanner scan, String string, int trial){
String input= scan.next();
//char choice1= string.charAt(0);
//char choice2= string.charAt(1);
//char choice3= string.charAt(2);
//char choice4= string.charAt(3);

while(trial>0){
    //attack
    if(input.equals("a")|input.equals("A")){
        int determinant= (int)(2*Math.random()) ;
        //hit
        if(determinant==1){
            
            System.out.println("Critical Hit!");
            trial--;
            
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
            scan= new Scanner(System.in);
             input= scan.next();
        }
        //miss
        else if(determinant==0){
            System.out.println("Gosh! How can you miss it!");
             System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
            scan= new Scanner(System.in);
             input= scan.next();
        }
        else{
            System.out.println("Counting system went wrong!");
            System.exit(0);
            
        }
    }
    //escape
    else if (input.equals("e")|input.equals("E")){
        int determinant2=(int)(1+10*Math.random())  ;
        //success
        if(determinant2==10){
            trial=-5;
        }
        //fail
        else if(determinant2<10&&determinant2>=1){
            
            System.out.println("escape failed!");
             System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
            scan= new Scanner(System.in);
             input= scan.next();
        }
        else{
            System.out.println("Counting system 2 went wrong!");
            System.exit(0);
        }
        
    }
    else {
        System.out.println("Executed by the GIANT! Game Over! ");
        System.exit(0);
    }
}

return "AaEe";
}


//method4

public static String getInput(Scanner scan, String string){
    String input= scan.next();
    //char valid1= string.charAt(0);
    //char valid2= string.charAt(1);
    if (input.equals("C")||input.equals("c")){
        
    }
    else{
        System.out.println("Yea right LOSER!");
        System.exit(0);
    }
    return "Cc";
}


//method1


 public static void giant() {

        System.out.println("                                 ---------                    ");

        System.out.println("                                |  /    \\ |                   ");

        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");

        System.out.println("                           H     -----------   H              ");

        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");

        System.out.println("                           H    HHHHHHHHHHH    H                      ");

        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");

        System.out.println("                                HHHHHHHHHHH                   ");

        System.out.println("                                HHH     HHH                   ");

        System.out.println("                               HHH       HHH                   ");

    }

//method2


 public static void box(){

        System.out.println("                     *********************     *********************    *********************             ");

        System.out.println("                     ***               ***     ***               ***    ***               ***              ");

        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");

        System.out.println("                     ***               ***     ***               ***    ***               ***              ");

        System.out.println("                     *********************     *********************    *********************               "); 

    }

//method3

 public static void cave() {

        System.out.println("                              *****   * * * * * * * *        ");

        System.out.println("                         ***         ***                      ");

        System.out.println("                      ***               ***                   ");

        System.out.println("                 |    ***               ***                   ");

        System.out.println("                 |    ***               ***                   ");

        System.out.println("             O __|__  ***               ***                   ");

        System.out.println("           ******l    ***               ***                   ");

        System.out.println("            * *       ***               ***                   ");

        System.out.println("           *   *      ********************* * * * * * *       ");

    }



//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//###########################################
//end of homework
}