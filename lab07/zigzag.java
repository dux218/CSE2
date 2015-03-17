//Duo Xu    2015/3/5
//Laboratory Session 7: ZIGZAG

//import Scanner class
import java.util.Scanner;

//add class and main method
public class zigzag{
    //main method required for every java program
    public static void main(String[] args){
//Step 1 
        //first print 10 * in a line
        for (int nStars=10;nStars>=1; nStars--){
            System.out.print("*");
            
        }
        System.out.print("\n");
//Step 2
        //initialize the count used to count the rows of the print
        int count1=10; 
        // control the number of rows and 
        while (count1>=1){
            //calculate the number of space before *
            int count2=10-count1;
            //print the space
            while (count2>=1){
                System.out.print(" ");
                count2--;
            }
        
            //print the *
            System.out.print("*");
            //enter to the next row
            System.out.print("\n");
            //deduct the count when one row is finished
            count1--;
            
        }
        
//Step3
//infinite loop also used to control whether to re-run the program
while(true){
    
        //first initialize the nStars that is out side the interval to enter the loop
        int nStars=0;
        //ask the user to enter again when the input is not between 3 and 33
        while(nStars<3|nStars>33){
            //prompt the user to enter a valid input
            System.out.print("Enter an int between 3 and 33 :");
            //declare an instance for the Scanner class that will take input from STDIN
            Scanner input=new Scanner (System.in);
            
            //ask the user to enter again if the input is not an integer
            while (!input.hasNextInt()){
                //prompt the user to enter again
                System.out.print("Enter an int between 3 and 33 :");
                //declare an instance again if the input before is not an integer
                input=new Scanner(System.in);
               
            }
            //cast the integer to nStars again and if its in the interval, the loop will end
            //otherwise it will loop again
            nStars=input.nextInt();
            
            
        }
//Second part step 1   
        count1=nStars;
        
        for (;count1>=1;count1--){
            System.out.print("*");
            
        }
        System.out.print("\n");
        
//Second part step 2        
        count1=nStars; 
        int count3=count1;
        while (count1>=3){
            
            int count2=count3-count1+1;
            
            while (count2>=1){
                System.out.print(" ");
                count2--;
            }
        
            
            System.out.print("*");
            System.out.print("\n");
            count1--;
            
        }
        
        
//Third part step3
        count1=nStars;
        
        for (;count1>=1;count1--){
            System.out.print("*");
            
        }
        System.out.print("\n");
        

//The part that decide whether to run the program again        
        System.out.print("Enter y or Y to go again: ");
        Scanner input=new Scanner (System.in);
        
        String det2= "";
        det2 += input.next();
        
        
        if (det2.equals("y")|det2.equals("Y")){
          //since the outer most loop is always true, do nothing means run again 
        }
        else {
            //otherwise I stop the loop and end the program
            break;
        }
        
    
}        
        
    }
}