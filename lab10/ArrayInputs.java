//Duo Xu    2015/4/2
//[CSE2] lab10: Arrays

import java.util.Scanner;

public class ArrayInputs{
    public static void main (String[] args){
        
        System.out.println("Please enter an integer for the size of an array");
        Scanner input=new Scanner(System.in);
        if(input.hasNextInt()){
            int count=input.nextInt();
            if(count>0){
                int[] array1=new int[count];
                int count2=1;
                while(count2<=count){
                
                    System.out.println("Please enter a positive integer: ");
                    input=new Scanner(System.in);
                    if(input.hasNextInt()){
                        int input2=input.nextInt();
                        if(input2>0){
                            array1[count2-1]=input2;
                            count2++;
                        }
                        else {
                            System.out.println("Sorry, the number you entered is negative.");
                        }
                    
                    }
                    else {
                        System.out.println("Sorry, you didn’t enter an integer.");
                    }
                }
                System.out.println("The array is: ");
                for(int count3=1;count3<=count;count3++){
                    System.out.println(array1[count3-1]);
                    
                }
            }
            else {
                System.out.println("Sorry, the number you entered is not a positive integer.");
            }
        }
        else {
            System.out.println("Sorry, the number you entered is not a positive integer.");
        }
    }
}