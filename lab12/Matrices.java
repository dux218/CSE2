//Duo Xu    2015/4/17
//[CSE2] lab12: Row and Column Major Matrices

import java.util.Scanner;

public class Matrices{
    public static void main(String[] args){
        int width1=(int)(Math.random()*6);
        int width2=(int)(Math.random()*6);
        int height1=(int)(Math.random()*6);
        int height2=(int)(Math.random()*6);
        
        int[][]A=new int[height1][width1];
        int[][]B=new int[width1][height1];
        int[][]C=new int[height2][width2];
        
        A=increasingMatrix(width1,height1,true);
        B=increasingMatrix(width1,height1,false);
        C=increasingMatrix(width2,height2,true);
        
        System.out.println("Generating a matrix with width "+width1+" and height "+height1+" :");
        printMatrix(A,true);
        
        System.out.println("Generating a matrix with width "+width1+" and height "+height1+" :");
        printMatrix(B,false);
        
        System.out.println("Generating a matrix with width "+width2+" and height "+height2+" :");
        printMatrix(C,true);
        
        addMatrix(A,true,B,false);
        
        addMatrix(A,true,C,true);
        
        
        
        
    }//main class end
    
    //first method
    public static int[][] increasingMatrix(int width, int height, boolean format){
        //row major 
        int count1=0;
        int[][] matrix1 ;
        if (format==true){
             matrix1=new int[height][width];
            for(int i=0;i<height;i++){
                for(int j=0;j<width;j++){
                    count1++;
                    matrix1[i][j]=count1;
                }
                
            }
        }
        else {
            matrix1=new int[width][height];
            for(int i=0;i<height;i++){
                for(int j=0;j<width;j++){
                    count1++;
                    matrix1[j][i]=count1;
                }
                
                
            }
        }
        return matrix1;
    }
    //second method
    public static void printMatrix( int[][] array, boolean format ){
        if(array.length==0||array[0].length==0){
        //if(array.length==0||array[0].length==0){
            System.out.println("the array was empty!");
        }
        //non-empty
        else{
            if(format==true){
                for(int i=0;i<array.length;i++){
                    System.out.print("[ ");
                    for(int j=0;j<array[0].length;j++){
                        System.out.print(array[i][j]+" ");
                    }
                    System.out.println("]");
                    
                }
            }
            else{
                for(int i=0;i<array[0].length;i++){
                    System.out.print("[ ");
                    for(int j=0;j<array.length;j++){
                        System.out.print(array[j][i]+" ");
                    }
                    System.out.println("]");
                }
            }
           
        }
    }
    //third method
    public static int[][] translate(int[][] array){
        if(array.length==0||array[0].length==0){
            return null;
        }
        else{
            int width=array.length;
            int height=array[0].length;
            int[][] arrayRow=new int[height][width];
            for(int i=0;i<height;i++){
                for(int j=0;j<width;j++){
                    arrayRow[i][j]=array[j][i];
                }
            }
            return arrayRow;
        } 
        
    }
    //fourth method
    public static int[][] addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb){
        int[][] array1; int[][] array2;
        //a
        if(formata==true){
            array1=a;
        }
        else{
            array1=translate(a);
        }
        //b
        if(formatb==true){
            array2=b;
        }
        else{
            array2=translate(b);
        }
        
        if(array1.length!=0&&array1[0].length!=0&&array2.length!=0&&array2[0].length!=0){
        
            int widthA=array1[0].length;
            int heightA=array1.length;
            int widthB=array2[0].length;
            int heightB=array2.length;
        
            if(widthA==widthB&heightA==heightB){
            
                System.out.println("Adding two matrices.");
                printMatrix(a,formata);
                System.out.println("plus");
                printMatrix(b,formatb);
                System.out.println("Translating column major to row major input.");
                System.out.println("output:");
        
                int [][]arrayOut=new int[heightA][widthA];
                for(int i=0;i<heightA;i++){
                    for(int j=0;j<widthA;j++){
                        arrayOut[i][j]=array1[i][j]+array2[i][j];
                    }
                }
                printMatrix(arrayOut,true);
                return arrayOut;
            }
            else{
            System.out.println("Unable to add input matrices.");
            return null;
        }
        }
        else{
            System.out.println("Unable to add input matrices.");
            return null;
        }
    }



    
    
    
    
    
}//public class