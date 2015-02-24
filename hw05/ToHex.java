//Duo Xu    2015/2/20
//[CSE2]: Decimal to Hexadecimal Converter
//I divided the program into three part

//import Scanner Class
import java.util.Scanner;

//add class and main method
public class ToHex{
    //main method requird for every java
    public static void main(String[] args){
        //declare and instance of the Scanner object
        Scanner input=new Scanner (System.in);
        //prompt the user to type in the number of RGB
        System.out.println("Please enter three numbers representing RGB values (each between 0 and 255) : ");
        
//FIRST PART of the program, examine whether the input is legal and satisfactory
        int R=0,G=0,B=0;
        //examine whether it is an int
        if (input.hasNextInt()){
            int first= input.nextInt();
            //examine whether it is in the range
            if (first>=0&&first<=255){
               R= first; 
            }
            else {
                System.out.println("Sorry, you must enter values between 0-255.");
                return;
            }
        }
        else {System.out.println("Sorry, your input must consist of integers.");
            return;
        }
        
        if (input.hasNextInt()){
            int second= input.nextInt();
            if (second>=0&&second<=255){
               G= second; 
            }
            else {
                System.out.println("Sorry, you must enter values between 0-255.");
                return;
            }
        }
        else {System.out.println("Sorry, your input must consist of integers.");
            return;
        }
        
        if (input.hasNextInt()){
            int third= input.nextInt();
            if (third>=0&&third<=255){
               B= third; 
            }
            else {
                System.out.println("Sorry, you must enter values between 0-255.");
                return;
            }
        }
        else {System.out.println("Sorry, your input must consist of integers.");
            return;
        }

//SECOND PART of the program, extract each digit of the R, G, and B to prepare for future transfer         
        int remainder1, remainder2,remainder3;
        int dividerR,dividerG,dividerB;
        
        remainder1=R%16;
        dividerR=(R-remainder1)/16;
        
        remainder2=G%16;
        dividerG=(G-remainder2)/16;
        
        remainder3=B%16;
        dividerB=(B-remainder3)/16;

//THIRD PART of the program, transfer each digit of R, G, and B into hexadecimal
        String secondString="";
        if (remainder1>=0&&remainder1<=9){
            
              secondString +=remainder1;
            
        }
        
        else {    switch(remainder1){
                case 10 :  secondString = "A";
                          break;
                case 11 :  secondString = "B";
                          break;
                case 12 : secondString =  "C";
                          break;  
                case 13 :  secondString = "D";
                          break; 
                case 14 :  secondString = "E";
                          break;      
                case 15 :  secondString = "F";
                          break;          
            }
        }
        
        
        String firstString="";
        if (dividerR>=0&&dividerR<=9){
            
              firstString +=dividerR;
            
        }
        
        else {    switch(dividerR){
                case 10 :  firstString = "A";
                          break;
                case 11 :  firstString = "B";
                          break;
                case 12 :  firstString = "C";
                          break;  
                case 13 :  firstString = "D";
                          break; 
                case 14 :  firstString = "E";
                          break;      
                case 15 :  firstString = "F";
                          break;          
            }
        }
        
        
        String fourthString="";
        if (remainder2>=0&&remainder2<=9){
            
              fourthString +=remainder2;
            
        }
        
        else {    switch(remainder2){
                case 10 :  fourthString = "A";
                          break;
                case 11 :  fourthString = "B";
                          break;
                case 12 :  fourthString = "C";
                          break;  
                case 13 :  fourthString = "D";
                          break; 
                case 14 :  fourthString = "E";
                          break;      
                case 15 :  fourthString = "F";
                          break;          
            }
        }
        
         String thirdString="";
        if (dividerG>=0&&dividerG<=9){
            
              thirdString +=dividerG;
            
        }
        
        else {    switch(dividerG){
                case 10 :  thirdString = "A";
                          break;
                case 11 :  thirdString = "B";
                          break;
                case 12 :  thirdString = "C";
                          break;  
                case 13 :  thirdString = "D";
                          break; 
                case 14 :  thirdString = "E";
                          break;      
                case 15 :  thirdString = "F";
                          break;          
            }
        }
        
        String sixthString="";
        if (remainder3>=0&&remainder3<=9){
            
              sixthString +=remainder3;
            
        }
        
        else {    switch(remainder3){
                case 10 :  sixthString = "A";
                          break;
                case 11 :  sixthString = "B";
                          break;
                case 12 :  sixthString = "C";
                          break;  
                case 13 :  sixthString = "D";
                          break; 
                case 14 :  sixthString = "E";
                          break;      
                case 15 :  sixthString = "F";
                          break;          
            }
        }
        
        String fifthString="";
        if (dividerB>=0&&dividerB<=9){
            
              fifthString +=dividerB;
            
        }
        
        else {    switch(dividerB){
                case 10 :  fifthString = "A";
                          break;
                case 11 :  fifthString = "B";
                          break;
                case 12 :  fifthString = "C";
                          break;  
                case 13 :  fifthString = "D";
                          break; 
                case 14 :  fifthString = "E";
                          break;      
                case 15 :  fifthString = "F";
                          break;          
            }
        }
       
        System.out.println("The decimal numbers R:"+R+", G:"+G+", B:"+B+", is represented in hexadecimal"+
        "as: "+firstString+secondString+thirdString+fourthString+fifthString+sixthString);
    }
}
 