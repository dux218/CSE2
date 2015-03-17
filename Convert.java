
import java.util.Scanner;

public class Convert {
    public static void main(String[] args){
        
        int valueOfInput, digit1, digit2, digit3,valueOfOutput;
        
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a value in binary between 0 and 111 inclusive :");
        
        valueOfInput=input.nextInt();
        
        digit3=valueOfInput%10;
        
        digit2=(valueOfInput/10)%10;
        
        digit1=valueOfInput/100;      //examine whether it is less than 111
        
        if (valueOfInput<0||digit1>1||digit2>1||digit3>1){
            
            System.out.println("invalid input");
            
        }
        else {
            valueOfOutput=4*digit1+2*digit2+1*digit3;
            
            System.out.println("Value of the input Binary number is :"+valueOfOutput);
            
        }
    }
}