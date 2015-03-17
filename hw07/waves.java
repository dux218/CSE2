//Duo Xu    2015/3/6
//hw07: Number Waves

//import Scanner class
import java.util.Scanner;

//add class and main method
public class waves{
    //main method required for every java program
    public static void main(String[] args){
        //initialize variable to enter the loop
        int initial1= 0;

//first let the user to enter a valid input

        //answer the user to enter again if the input is out of range
        while (initial1<1|initial1>30){
            //prompt user to enter number
            System.out.print("Enter a number between 1 and 30: ");
            //declare an instance for the Scanner class that take input for STDIN
            Scanner input=new Scanner (System.in);
            //answer the user to enter again if the input is not an integer
            while (!input.hasNextInt()){
                //prompt user to enter an integer 
                System.out.print("Enter a number between 1 and 30: ");
                //redeclare the instance
                input=new Scanner (System.in);
                
            }
            //cast value to initial1, if the value is valid, the loop will end
            //otherwise the loop will run again to let the user enter a valid input again
            initial1=input.nextInt();
        }
        
        System.out.print("\n");
        
        
        
//FOR LOOP        
        System.out.println("FOR LOOP: ");
        //initialize value, count1 is used to control the number of triange
        //count2 is used to control the number of row of each triangle
        //count3 is used to control the number of number in each row
        int count1= initial1; int count2=1 ; int count3=1;
        
        //loop for the number of triangle
        for(;count1>=1;count1--){
            
            //even number triangle
            for(;(initial1-count1+1)%2==0&&count2<=initial1-count1+1;count2++){
                
                //the number of a value in one row
                for (;count3<=count2;count3++){
                    System.out.print(initial1-count1+1);
                    
                    
                }
                System.out.print("\n");
                count3=1;
                
                
            
                 
            }
            
            //odd number triangle
            
            for (;(initial1-count1+1)%2!=0&&count2<=initial1-count1+1;count2++){
                int count5=initial1-count1+1;
                //the number of value in one row
                for(;count5>=count2;count5--){
                    System.out.print(initial1-count1+1);
                    
                    
                }
                System.out.print("\n");
                
                
            
            
            
            }
            //initialize the count2 for the next triangle
            count2=1;
            
        }
        System.out.print("\n");







// WHILE LOOP        
        System.out.println("WHILE LOOP: ");
        //initialize the count again
        count1= initial1; count2=1 ; count3=1;
        
        while(count1>=1){
            //even
            while((initial1-count1+1)%2==0&&count2<=initial1-count1+1){
              
                while (count3<=count2){
                    System.out.print(initial1-count1+1);
                    count3++;
                    
                }
                System.out.print("\n");
                count3=1;
                
                count2++;
            
                 
            }
            
            //odd
            //int count5=initial1-count1+1;
            while((initial1-count1+1)%2!=0&&count2<=initial1-count1+1){
                int count5=initial1-count1+1;
                
                while(count5>=count2){
                    System.out.print(initial1-count1+1);
                    count5--;
                    
                }
                System.out.print("\n");
                count2++;
                
            
            
            
            }
            count2=1;
            count1--;
        }
        System.out.print("\n");
        

        
//DO-WHILE LOOP        
        System.out.println("DO-WHILE LOOP: ");
        
        count1= initial1; count2=1 ; count3=1;
        
        do {
            //even
            if ((initial1-count1+1)%2==0){
              do {
              
                do {
                    System.out.print(initial1-count1+1);
                    count3++;
                    
                } while (count3<=count2);
                
                System.out.print("\n");
                count3=1;
                
                count2++;
            
                 
              } while(count2<=initial1-count1+1);
            }
            //odd
            //int count5=initial1-count1+1;
            else{
            do {
                int count5=initial1-count1+1;
                
                do {
                    System.out.print(initial1-count1+1);
                    count5--;
                    
                } while(count5>=count2);
                System.out.print("\n");
                count2++;
                
            
            
            
            } while(count2<=initial1-count1+1);
            }
            count2=1;
            count1--;
        } while(count1>=1);
        System.out.print("\n");
        
        
    }
}