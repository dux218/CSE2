//Duo Xu  2015/4/24
//Homework Assignment 13: To the Fourth Dimension and Beyond!


//import Scanner Class
import java.util.Scanner;

//class and main method
public class FourDwin{
    public static void main(String[] args){
        
        
        
//first take the input value of X
        
        int X=-3;
        System.out.print("Enter an integer X: ");
        while(X<=0){
            Scanner input= new Scanner(System.in);
            if(input.hasNextInt()){
                X=input.nextInt();
                if(X<=0){
                    System.out.print("Invalid input. Please enter a positive integer: ");
                }
            }
            else{
                System.out.print("Invalid input. Please enter an integer: ");
            }
        }
        
        
//take the input value of Y
        int Y=-3;
        System.out.print("Enter an integer Y where Y > X: ");
        while(Y<=0){
            Scanner input= new Scanner(System.in);
            if(input.hasNextInt()){
                Y=input.nextInt();
                if(Y<=0){
                    System.out.print("Invalid input. Please enter a positive integer where Y > X: ");
                    
                }
                else{
                    if(Y<=X){
                        System.out.print("Invalid input. Please enter a positive integer where Y > X: ");
                        Y=-3;
                    }
                }
            }
            else{
                System.out.print("Invalid input. Please enter an integer where Y > X: ");
            }
        }
        
//create the length of each sub array inside the 4D array  , then fill the array with random number 

        //there are three 3D array requested by the assignment
        double [][][][] array=new double[3][][][];
        
        //three loop to control the length of each array
        for(int i=0;i<3;i++){
            array[i]=new double [(int)(Math.random()*(Y-X+1))+X][][];
            for(int j=0; j<array[i].length;j++){
                array[i][j]=new double [(int)(Math.random()*(Y-X+1))+X][];
                for (int k=0;k<array[i][j].length;k++){
                    array[i][j][k]=new double[(int)(Math.random()*(Y-X+1))+X];
                    for(int m=0;m<array[i][j][k].length;m++){
                        //creating random doubles between 0 and 30
                        array[i][j][k][m]= ((int)(Math.random()*301))/10.0;
                    }
                }
            }
        }
        
//print the original array
        System.out.println("Original Array:");
        printArray(array);
        
//print the sorted array
        System.out.print("\n");
        System.out.println("Sorted Array:");
        
        //sort the 4D array first
        array=sort4DArray(array);
        
        //sort each of the three 3D array
        array[0]=sort3DArray(array[0]);
        array[1]=sort3DArray(array[1]);
        array[2]=sort3DArray(array[2]);
        
        //print
        printArray(array);
        
//print the sum, mean, and number of elements of the array
        System.out.println(" ");
        statArray(array);
        
        
        
    }//main method end
    
    
//print sum, mean, and number of elements.
    public static void statArray(double[][][][] inputArray){
        //count1 is used to find the number of elements, 
        int count1=0;
        double sum=0;
        
        for(int i=0;i<inputArray.length;i++){
            for(int j=0; j<inputArray[i].length;j++){
                for (int k=0;k<inputArray[i][j].length;k++){
                    for(int m=0;m<inputArray[i][j][k].length;m++){
                        count1++;
                        sum+=inputArray[i][j][k][m];
                    }
                }
            }
        }
        double mean = sum/count1;
        System.out.println("Members: "+count1);
        System.out.printf("Sum: %4.1f\n",sum);
        System.out.printf("Mean: %4.3f\n",mean);
        
    }
/////////////////////////////////////////////////////////////////////////////////////

//4D sort method using insertion sort

    public static double[][][][] sort4DArray(double[][][][] inputArray){
        for(int i=1;i<inputArray.length;i++){
            int currentSize=0;
            double currentSmall=41;
            //get the size and smallest value of current 3D array that will be inserted later
            for(int j=0;j<inputArray[i].length;j++){
                for(int m=0;m<inputArray[i][j].length;m++){
                    for(int n=0;n<inputArray[i][j][m].length;n++){
                        currentSize++;
                        if (currentSmall>inputArray[i][j][m][n]){
                            currentSmall=inputArray[i][j][m][n];
                        }
                    }
                }
            }
            
            //temporary store the  current 3D array to prevent replacement
            double[][][] current3D=inputArray[i];
            
            //k is the position where current array insert 
            int k;
            //aa is used to jump out the loop if java found the insert place
            boolean aa=false;
            for(k=i-1;k>=0&&aa==false;k--){
                //get the size and smallest value of each 3D array that are compared
                double nowSmall=41;
                int nowSize=0;
                for(int j=0;j<inputArray[k].length;j++){
                for(int m=0;m<inputArray[k][j].length;m++){
                    for(int n=0;n<inputArray[k][j][m].length;n++){
                        nowSize++;
                        if (nowSmall>inputArray[k][j][m][n]){
                            nowSmall=inputArray[k][j][m][n];
                        }
                    }
                
                }
                }
                
                
                //put each 3D array to the right if it is larger than current array
                if(nowSize>currentSize){
                    inputArray[k+1]=inputArray[k];
                }
                //when size are equal, compare the minimum element
                else if(nowSize==currentSize){
                    if(nowSmall>currentSmall){
                        inputArray[k+1]=inputArray[k];
                    }
                    //jump out the loop because the size of the current array is larger than the compared array
                    //no need to put ahead
                    else{
                        aa=true;
                        break;
                    }
                //the size of current array is larger then the compared array size
                //no need to put ahead
                }
                else{
                    aa=true;
                    break;
                }
               
                
            
                
            }
            //insert the current 3D array in the position of k+1
            inputArray[k+1]=current3D;
            
        }
        return inputArray;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//print method
    public static void printArray(double[][][][] inputArray){
        
        //I break line when each of the 3D array finished printing
        
        
        for(int i=0;i<inputArray.length;i++){
        
                System.out.print("{");
            
            
            for(int j=0;j<inputArray[i].length;j++){
                //when j=0. I don't print " , " 
                if(j==0){
                    System.out.print("{");
                }
                else{
                    System.out.print(", {");
                }
                for(int k=0; k<inputArray[i][j].length;k++){
                    //when k=0, I don't print " , "
                    if(k==0){
                        System.out.print("{");
                    }
                    else{
                        System.out.print(", {");
                    }
                    for(int m=0;m<inputArray[i][j][k].length;m++){
                        //when m=0, I dont't print " , "
                        if(m==0){
                            System.out.print(inputArray[i][j][k][m]);
                        }
                        else{
                            System.out.print(", "+inputArray[i][j][k][m]);
                        }
                    }
                    System.out.print("}");
                }
                System.out.print("}");
            }
            //at the end of the print, I don't print " , "
            if(i==2){
                System.out.println("}");
            }
            else{
                System.out.println("}, ");
            }
        }
    }
///////////////////////////////////////////////////////////////////////////////////////
    
//3D sort method  using selection sort     
    
    public static double[][][] sort3DArray(double[][][] inputArray){
        
        //get the number of element and the minimum element of the current array later compared to other arrays
        for(int i=0;i<inputArray.length;i++){
            int currentSize=0;
            double currentSmall=41;
            for(int j=0;j<inputArray[i].length;j++){
                for(int m=0;m<inputArray[i][j].length;m++){
                    
                        currentSize++;
                        if (currentSmall>inputArray[i][j][m]){
                            currentSmall=inputArray[i][j][m];
                        }
                    
                }
            }
            
            
            
            //store the index and array of current array
            int index=i; double[][]current2D=inputArray[i];
            
            //compare with array right to the current array and find the smallest array
            for(int k=i+1;k<inputArray.length;k++){
                
                //find the number of elements and the minimum elements of each array
                int nowSize=0;
                double nowSmall=41;
                for(int j=0;j<inputArray[k].length;j++){
                    for(int m=0;m<inputArray[k][j].length;m++){
                     
                            nowSize++;
                            if (nowSmall>inputArray[k][j][m]){
                                nowSmall=inputArray[k][j][m];
                            }
                    
                    }
                }
                
                //replace the current minimum array with the newest smaller array founded
                if(nowSize<currentSize||(nowSize==currentSize&&nowSmall<currentSmall)){
                    currentSize=nowSize;
                    currentSmall=nowSmall;
                    //replace the index with the index of the smaller array
                    index=k;
                }
                
            }
            //after finding the smallest array, change the position of it with the current one 
            double[][]temp=inputArray[i];
            inputArray[i]=inputArray[index];
            inputArray[index]=temp;
            
            
        }
        return inputArray;
    }//find now small and current size


}//public class ended