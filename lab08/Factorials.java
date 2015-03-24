//Duo Xu    2015/3/19  CSE2
//Methods

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args){
        
        int number=0;
        
        while(number<=0){
             Scanner scan = new Scanner (System.in);
             System.out.print("Please enter a positive integer :");
             while (!scan.hasNextInt()){
                 System.out.print("Please enter a positive integer :");
                 scan=new Scanner(System.in);
             }
            
            number=(int) scan.nextInt();
        }
        
        int initial=number;
        int superFactorial=0;
        
        for(;number>0;number--){
            superFactorial += factorial(number);
        }
        
        
        print(initial,superFactorial);
        
       
        
        
       
        
    }


public static int factorial (int input){
    int result=1;
    
    
    for(;input>0;input--){
        
        result *=input;
    }
    
    return result;
}

public static void print(int base, int output) {
    System.out.println("\"The super factorial of "+base+" is "+output+"\"");

}

}