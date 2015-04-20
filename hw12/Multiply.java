//Duo Xu    2015/4/17
//[CSE2] hw12: Matrix Multiplication

//import Scanner class
import java.util.Scanner;

//class and main method
public class Multiply{
    public static void main(String[] args){
        
//first let users enter four inputs of the two random matrices

//height1
        System.out.println("Enter the height of the first array :");
        //initialize height1 to be within the range of the loop
        int height1=-5;
        //loop operate when the input is not valid
        while(height1<0){
            
            //create an instance for the Scanner object that late take input from the STDIN
            Scanner input=new Scanner(System.in);
            //examine whether the input is an integer or not
            if(input.hasNextInt()){
                //take the value of the input
                height1=input.nextInt();
                //examine whether the value is inside the range
                if(height1>0){
                    
                }
                //prompt the user that the input is not a positive integer, and ask the user to enter again
                else{
                    System.out.println("You did not enter a positive integer, enter again :");
                    
                }
            }
            //propmpt the user that the input is not a positive integer, and ask the user to enter again
            else{
                System.out.println("You did not enter an integer, enter again :");
            }
        }
        
//width1  (The same to height1)
        System.out.println("Enter the width of the first array :");
        int width1=-5;
        while(width1<0){
            
            Scanner input=new Scanner(System.in);
            if(input.hasNextInt()){
                width1=input.nextInt();
                if(width1>0){
                    
                }
                else{
                    System.out.println("You did not enter a positive integer, enter again :");
                    
                }
            }
            else{
                System.out.println("You did not enter an integer, enter again :");
            }
        }
        
//height2  (Addition step to examine whether height2 = width1)
        System.out.println("Enter the height of the second array (Should be equal to the width of 1st array) :");
        int height2=-5;
        while(height2<0){
            
            Scanner input=new Scanner(System.in);
            if(input.hasNextInt()){
                height2=input.nextInt();
                if(height2>0){
                    if(height2==width1){
                        
                    }
                    else{
                        System.out.println("The height of the second array is not equal to the width of the first array.");
                        System.out.println("Please enter again :");
                        height2=-5;
                    }
                }
                else{
                    System.out.println("You did not enter a positive integer, enter again :");
                    
                }
            }
            else{
                System.out.println("You did not enter an integer, enter again :");
            }
        }
        
//width2   (The same)
        System.out.println("Enter the width of the second array :");
        int width2=-5;
        while(width2<0){
            
            Scanner input=new Scanner(System.in);
            if(input.hasNextInt()){
                width2=input.nextInt();
                if(width2>0){
                    
                }
                else{
                    System.out.println("You did not enter a positive integer, enter again :");
                    
                }
            }
            else{
                System.out.println("You did not enter an integer, enter again :");
            }
        }
        
//finished taking two sets of inputs
//-----------------------------------------------------------------------------------------------

//create two random array using the 4 inputs
        int[][] newArray1=randomMatrix(width1,height1);
        int[][] newArray2=randomMatrix(width2,height2);
        
//print out the first array
        System.out.println("The first random matrix :");
        for (int i=0;i<newArray1.length;i++){
            System.out.print("[ ");
            for(int j=0;j<newArray1[0].length;j++){
                System.out.printf("%3d",newArray1[i][j]);
                System.out.print(" ");
            }
            System.out.println("]");
        }
        
//print out the second array
        System.out.println("The second random matrix :");
        for (int a=0;a<newArray2.length;a++){
            System.out.print("[ ");
            for(int b=0;b<newArray2[0].length;b++){
                System.out.printf("%3d",newArray2[a][b]);
                System.out.print(" ");
            }
            System.out.println("]");
        }
        
//apply the matrix multiply method and get the product array
        int[][] productArray=matrixMultiply(newArray1,newArray2);
        
//print out the product matrix
        System.out.println("The product matrix :");
        for (int x=0;x<productArray.length;x++){
            System.out.print("[ ");
            for(int y=0;y<productArray[0].length;y++){
                System.out.printf("%4d",productArray[x][y]);
                System.out.print(" ");
            }
            System.out.println("]");
        }
        
        
        
        
        
        
        
    }//end of main method
    
    
//method that create a random method
    public static int[][] randomMatrix(int width,int height){
        int[][] array=new int [height][width];
        if(height==0|width==0){
            return null;
        }
        else{
            for(int i=0;i<height;i++){
                for(int j=0;j<width;j++){
                    array[i][j]=(int)(Math.random()*21)-10;
                }
            }
            return array;
        }
        
    }
    
//method that multiply two array and return the result product array
    public static int[][] matrixMultiply(int[][] array1,int[][] array2){
        //debug when the input array is null
        if(array1.length==0||array1[0].length==0||array2.length==0||array2[0].length==0){
            System.out.println("Error!");
            return null;
        }
        //get the length of the two two-dimension array
        else{
            int width1=array1[0].length;
            int height1=array1.length;
            int width2=array2[0].length;
            int height2=array2.length;
            
            //debug to examine whether the width1 of the first array is equal to the height of the second array
            if(width1==height2){
                int[][] arrayOut=new int [height1][width2];
                
                for(int i=0;i<height1;i++){
                    for(int j=0;j<width2;j++){
                            //initialize the value of each element of the final array
                            arrayOut[i][j]=0;
                        for(int k=0;k<width1;k++){
                            arrayOut[i][j]+= array1[i][k]*array2[k][j];
                        }
                    }
                }
                
                
                return arrayOut;
                
                
                
            }
            else{
                System.out.println("Error!");
                return null;
            }
        }
    }


}//end of class