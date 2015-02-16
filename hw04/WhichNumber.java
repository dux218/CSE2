//Duo Xu     2015/2/14
//Homework Assignment 4   
//Program #1



//I divide the given flowchart into four branches-first,second,third, and fourth
//each branch has more than one, so counting from the left 
//eg:"Is it divisible by 5?" is fourth branch 2 



//import Scanner class
import java.util.Scanner;

//add class and main method
public class WhichNumber{
    //main method required for every java program
    public static void main(String[] args){
        
        //prompt the user to think of a number between 1 and 10
        System.out.println(" Think of an int between 1 and 10 inclusive ("+
   " ---Answer question using y/Y for yes and n/N for no)");   
       System.out.println("                                      ");
 //define y,Y,n,N as char 
 char y='y';
 char Y='Y';
 char n='n';
 char N='N';

   //declare an instance of the Scanner object that will take input from STDIN
   Scanner input= new Scanner (System.in);
 
   //first branch
   System.out.print("Is the number even? ");
   char clue1= input.next().charAt(0) ;
   
   //first branch yes
   if(clue1==y|clue1==Y){
      //second branch 1
      System.out.print("is it divisible by 3?");
      char clue2= input.next().charAt(0);
      
      if(clue2==y|clue2==Y){
          System.out.print("Is your number 6?");
          char clue3=input.next().charAt(0);
          if(clue3==y|clue2==Y){
              System.out.println("Yay!");
         }
         else if (clue3==n|clue3==N){
             System.out.println("You are lying!");
         }
         else {
             System.out.println("Sorry, that is not a valid input.");
         }
      }
      else if (clue2==n|clue2==N){
          //third branch1
          System.out.print("Is it divisible by 4?");
          
          char clue4=input.next().charAt(0);
          //third branch1 yes
          if(clue4==y|clue4==Y){
              //fourth branch 1
              System.out.print("Is the number divided by 4 greater than 1?");
              char clue5=input.next().charAt(0);
              //fourth branch1 yes
              if (clue5==y|clue5==Y){
                  System.out.print("Is your number 8?");
                  char clue6=input.next().charAt(0);
                  if(clue6==y|clue6==Y){
                      System.out.println("Yay!");
                  }
                  else if(clue6==n|clue6==N){
                      System.out.println("You are lying!");
                  }
                  else{
                      System.out.println("Sorry, that is not a valid input.");
                  }
              }
              //fourth branch 1 no
              else if (clue5==n|clue5==N){
                  System.out.print("Is your number 4?");
                  char clue7=input.next().charAt(0);
                  if(clue7==y|clue7==Y){
                      System.out.println("Yay!");
                  }
                  else if (clue7==n|clue7==N){
                      System.out.println("You are lying!");
                  }
                  else {
                      System.out.println("Sorry, that is not a valid input.");
                  }
              }
          }
          //third branch1 no
          else if(clue4==n|clue4==N){
           //fourth branch2
           System.out.print("Is it divisible by 5?");
           char clue8=input.next().charAt(0);
           //fourth branch2 yes
           if(clue8==y|clue8==Y){
               System.out.print("Is your number 10?");
               char clue9=input.next().charAt(0);
               if(clue9==y|clue9==Y){
                   System.out.println("Yay!");
               }
               else if (clue9==n|clue9==N){
                   System.out.println("You are lying!");
               }
               else {
                   System.out.println("Sorry, that is not a valid input.");
               }
           //fourth branch2 no    
           }
           else if(clue8==n|clue8==N){
               System.out.print("Is your number 2?");
               char clue10=input.next().charAt(0);
               if(clue10==y|clue10==Y){
                   System.out.println("Yay!");
               }
               else if(clue10==n|clue10==N){
                   System.out.println("You are lying!");
               }
               else{
                   System.out.println("Sorry, that is not a valid input.");
               }
           }
           else {
               System.out.println("Sorry, that is not a valid input.");
           }
          }
          else {
            System.out.println("Sorry, that is not a valid input."); 
          }
      }
      else {
          System.out.println("Sorry, that is not a valid input.");
      }
   }
   //first branch no
   else if (clue1==n|clue1==N){
    //second branch 2
    System.out.print("Is it divisible by 3?");
    char clue11=input.next().charAt(0);
    //second branch 2 yes
    if (clue11==y|clue11==Y){
        //third branch 2
        System.out.print("When divided by 3 is the result greater than 1?");
        char clue12=input.next().charAt(0);
        //third branch2 yes
        if (clue12==y|clue12==Y){
            System.out.print("Is your number 9?");
            char clue13=input.next().charAt(0);
            if (clue13==y|clue13==Y){
                System.out.println("Yay!");
            }
            else if(clue13==n|clue13==N){
                System.out.println("You are lying!");
            }
            else {
                System.out.println("Sorry, that is not a valid input.");
            }
        }
        //third branch2 no
        else if (clue12==n|clue12==N) {
            System.out.print("Is your number 3?");
            char clue14=input.next().charAt(0);
            if (clue14==y|clue14==Y){
                System.out.println("Yay!");
            }
            else if(clue14==n|clue14==N){
                System.out.println("You are lying!");
            }
            else {
                System.out.println("Sorry, that is not a valid input.");
            }
        }
        else {
            System.out.println("Sorry, that is not a valid input.");
        }
    }
    //second branch 2 no
    else if (clue11==n|clue11==N){
        System.out.print("Is it greater than 6?");
        //third branch 3
        char clue15=input.next().charAt(0);
        //third branch 3 yes
        if (clue15==y|clue15==Y){
            System.out.print("Is your number 7?");
            char clue16=input.next().charAt(0);
            if (clue16==y|clue16==Y){
                System.out.println("Yay!");
            }
            else if(clue16==n|clue16==N){
                System.out.println("You are lying!");
            }
            else {
                System.out.println("Sorry, that is not a valid input.");
            }
        }
        //third branch 3 no
        else if (clue15==n|clue15==N){
            System.out.print("Is it less than 3?");
            //fourth branch 3
            char clue17=input.next().charAt(0);
            //fourth branch 3 yes
            if (clue17==y|clue17==Y){
                System.out.print("Is your number 1?");
                char clue18=input.next().charAt(0);
                if (clue18==y|clue18==Y){
                    System.out.println("Yay!");
                }
                else if(clue18==n|clue18==N){
                    System.out.println("You are lying!");
                }
                else {
                    System.out.println("Sorry, that is not a valid input.");
                }
            }
            //fourth branch 3 no
            else if (clue17==n|clue17==N){
                System.out.print("Is your number 5?");
                char clue18=input.next().charAt(0);
                if (clue18==y|clue18==Y){
                    System.out.println("Yay!");
                }
                else if(clue18==n|clue18==N){
                    System.out.println("You are lying!");
                }
                else {
                    System.out.println("Sorry, that is not a valid input.");
                }
            }
            
        }
        else {
            System.out.println("Sorry, that is not a valid input.");
        }
        
    }
    else {
        System.out.println("Sorry, that is not a valid input.");
    }
    
   }
   
   
   
   else {
       System.out.println("Sorry, that is not a valid input.");
       return;
    } 
    }
    
}
    
       
    

    
   
    


