//Duo Xu     2015/4/3
//hw10: Elimination


import java.util.Scanner;

public class RemoveElements{

  public static void main(String [] arg){

    Scanner scan=new Scanner(System.in);

int num[]=new int[10];

int newArray1[];

int newArray2[];

int index,target;

    String answer="";

    do{

      System.out.print("Random input 10 ints [0-9]");

      num = randomInput();

      String out = "The original array is:";

      out += listArray(num);

      System.out.println(out);



      System.out.print("Enter the index ");

      index = scan.nextInt();

      newArray1 = delete(num,index);

      String out1="The output array is ";

      out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  

      System.out.println(out1);



      System.out.print("Enter the target value ");

      target = scan.nextInt();

      newArray2 = remove(num,target);

      String out2="The output array is ";

      out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  

      System.out.println(out2);

       

      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");

      answer=scan.next();

    }while(answer.equals("Y") || answer.equals("y"));

  }



  public static String listArray(int num[]){

    String out="{";

    for(int j=0;j<num.length;j++){

      if(j>0){

        out+=", ";

      }

      out+=num[j];

    }

    out+="} ";

    return out;

  }
  //make a random array and output 
  public static int[] randomInput(){
      int[] out =new int [10];
      for(int count1=0; count1<10;count1++){
          out[count1]=(int)(Math.random()*10);
      }
      return out;
  }
  //delete method
  public static int[] delete(int[] list,int pos){
    //count1 is used to read the array "list" from start to end, count2 is used to make the new array after delection
      int count1=0;int count2=0;
      int[] out=new int[9];
      //examine whether the index input is valid or not
      if(pos<0|pos>9){
          System.out.println("The index is not valid.");
          out=list;
      }
      else{
          
          System.out.println("Index "+pos+" element is removed");

      //take number from the original list out and save to the new output array if count1！=index
      while(count1<=9){
          if(count1!=pos){
              out[count2]=list[count1];
              count2++;
              count1++;
              
          }
          else{
              count1++;
          }
          
      }
      }
      return out;
      
  }
  //remove methods
  public static int[] remove(int[] list,int target){
    //count1 is used to read the array "list" from start to end, count2 is used to make the new array after removement
      int count1=0;int count2=0;
      //found2 is used to determine whether origin array has the element of target
      boolean found2=false;
      //determine whether the target has been found or not
      while(count1<=9){
          if(list[count1]!=target){
              count2++;
              count1++;
          }
          else if (list[count1]==target){
              count1++;
              found2=true;
              
          }
          else{
              
          }
      }
      
      //output the result
      if (found2==true){
          System.out.println("Element "+ target+" has been found");
      }
      else {
          System.out.println("Element "+ target+" was not found");
      }
      
      
      //then make the new array the same way as deletion
      int out[]=new int [count2];
      count1=0;count2=0;
      while(count1<=9){
          if (list[count1]!=target){
              out[count2]=list[count1];
              count2++;
              count1++;
              
          }
          else{
              count1++;
          }
      }
      return out;
  }



}

