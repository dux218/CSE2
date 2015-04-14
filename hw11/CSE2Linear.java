//Duo Xu     2015/4/10
//hw11: Fun with Searching

//import Scanner class
import java.util.Scanner;

//class and main method
public class CSE2Linear{
    public static void main(String[] args){
//First part create a valid list and print out

        //prompt user to enter 15 ints
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        //count1 is used to count the number of input,the array I used is from 1 to 15 instead of 0 to 14
        int count1=1;
        //define array1 to take 15 inputs
        int newArray1[]=new int[16];
        //array0 is used to avoid the problem that later the next input should not less than previous input
        //array0=0because 0 is the least number of inputs
        newArray1[0]=0;
        
        //loop for taking 15 ints
        while(count1<16){
            //declare an instance of the Scanner object that take inputs from the STDIN
            Scanner input=new Scanner(System.in);
            //determine whether it is an int
            if(input.hasNextInt()){
                int enter=input.nextInt();
                //determine whether it is in the range of [0,100]
                if(enter>=0&enter<=100){
                    
                    newArray1[count1]=enter;
                    //determine whether the next input is greater or less than previous input
                    if(newArray1[count1]>=newArray1[(count1)-1]){
                        count1++;
                    }
                    else{
                        System.out.println("Sorry, the the int is not greater than or equal to the last int.");
                    }
                }
                else{
                    System.out.println("Sorry, the grade is out of range.");
                }
            }
            else{
                System.out.println("Sorry, you did not enter an integer");
            }
        }
        
        //printed the 15 inputs from array1 to array15
        System.out.print("The grades, sorted, are: ");
        for(int i=1;i<16;i++){
            System.out.print(newArray1[i]+" ");
        }
        System.out.print("\n");
        
        
        
        
        //second part
        System.out.print("Enter a grade to search for: ");
        // "a" is created to control the repetition or end of a loop
        int a=0;
        while(a==0){
            Scanner input=new Scanner(System.in);
            if(input.hasNextInt()){
                a=input.nextInt();
                if(a>=0&a<=100){
                    
                }
                else{
                    System.out.println("Sorry, the input is out of range. Please enter again: ");
                    //since the integer is out of range, "a" should be equal to 0 to repeat the loop
                    a=0;
                }
                    
            }
            else{
                System.out.println("Sorry, you did not enter an integer. Please enter again: ");
            }
        }
        //insert binary search method and print the result of binary search
        binarySearch(newArray1,a);
        
        //print the scrambled array
        System.out.println("Scrambled:");
        //array2 after scramble, newArray2 is to take the return of Scrambled method
        int[] newArray2=scramble(newArray1);
        
        //print the scrambled array
        for(int i=1;i<16;i++){
            System.out.print(newArray2[i]+" ");
        }
        
        //prompt the user to enter a grade to search for again
        System.out.print("\n");
        System.out.print("Enter a grade to search for: ");
        int b=0;
        while(b==0){
            Scanner input=new Scanner(System.in);
            if(input.hasNextInt()){
                b=input.nextInt();
                if(b>=0&b<=100){
                    
                }
                else{
                    System.out.println("Sorry, the input is out of range. Please enter again: ");
                    b=0;
                }
                    
            }
            else{
                System.out.println("Sorry, you did not enter an integer. Please enter again: ");
            }
        }
       
        //linear search method and show the output
        
        linearSearch(newArray2,b);
        
        
    }//main method end -------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------
    
    //binary search method
    public static int binarySearch(int[] list, int key){
        int low=1;
        int high=list.length-1;
        int count=1;
        int count2=0;
        while(high>=low){
            int mid=(high+low)/2;
            if(list[mid]<key){
                low=mid+1;
            }
            else if(list[mid]>key){
                high=mid-1;
            }
            else{
                System.out.println(key+" was found in the list with "+count+" iterations");
                count2=1;
                break;
            }
            
            count++;
        }
        if(count2==0){
            System.out.println(key+" was not found in the list with "+count+" iterations");
        }
        return 1;
    }
    //scramble method
    public static int[] scramble(int[] list){
        int intermediate=0; int random=0;
        for(int i=1;i<list.length;i++){
            random=(int)(Math.random()*list.length-1)+1;
            intermediate=list[i];
            list[i]=list[random];
            list[random]=intermediate;
            
        }
        return list;
    }
    //linear search
    public static int linearSearch(int[] list,int key){
        boolean found3=true;
        int count3=0;
        for(int i=1;i<list.length;i++){
            if(list[i]==key){
                count3++;
                System.out.println(key+" was found in the list with "+(i-1)+" iterations");
                found3=false;
                
                break;
            }
            count3++;
        }
        if(found3){
            System.out.println(key+" was not found in the list with "+count3+" iterations");
        }
        return-1;
    }
    
    
    
    
    
    
}//public class


