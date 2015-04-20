//

import java.util.Scanner;

public class DD{
    public static void main(String[] args){
        int[]loop1=new int [9];
        for (int i=1;i<9;i++){
            loop1[i]=i;
        }
        implement(loop1);
        for(int i=1;i<9;i++){
            System.out.println(loop1[i]);
        }
    }
    public static void implement(int [] array1){
        array1[2]=10;
    }
}


