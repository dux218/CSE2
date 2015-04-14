//Duo Xu   2015/4/10
//lab11  Arrays


import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        int newArray1[]=new int[50];
        int newArray2[]=new int[50];
        
        for(int i=0;i<50;i++){
            newArray1[i]=(int)(Math.random()*101);
        }
        int maximum=0; int minimum=100;
        for(int a=0;a<50;a++){
            if(newArray1[a]>maximum){
                maximum=newArray1[a];
            }
            else if(newArray1[a]<minimum){
                minimum=newArray1[a];
            }
        }
        System.out.println("The maximum of array 1 is: "+maximum);
        System.out.println("The minimum of array 1 is: "+minimum);
        
        newArray2[0]=(int)(Math.random()*101);
        for(int b=1;b<50;b++){
            newArray2[b]=newArray2[(b-1)]+(int)(Math.random()*101);
        }
        System.out.println("The maximum of array 2 is: "+newArray2[49]);
        System.out.println("The minimum of array 2 is: "+newArray2[0]);
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an int: ");
        if(input.hasNextInt()){
              int integer=input.nextInt();
              if(integer>=0){
                  int low=0;
                  int high=newArray2.length-1;
                  int above=0;int below=0;
                  boolean found=false;
                  
                  while(high>=low){
                      int mid=(low+high)/2;
                      if(newArray2[mid]<integer){
                          low=mid+1;
                          below=newArray2[mid];
                          
                      }
                      else if(newArray2[mid]==integer){
                          found=true;
                      }
                      else{
                          high=mid-1;
                          above=newArray2[mid];
                      }
                  }
                  
                  if(found){
                      System.out.println(integer+" was found in the list.");
                  }
                  else{
                      System.out.println(integer+" was not found in the list.");
                      System.out.println("The number above the key was "+above);
                      System.out.println("The number below the key was "+below);
                  }
                  
                  
                  
                  
                  
                  
                  
              }
              else{
                  System.out.println("You did not enter an int > 0");
              }
        }
        else{
            System.out.println("You did not enter an int");
        }
        
        
        
    }
}

