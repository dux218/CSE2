//Ruoting Li

//Apr. 11st, 2015

//CSE002

//CSE2Linear Java Program

//

//  first compile the program

//      javac CSE2Linear.java

//  run the program

//      java CSE2Linear




//first import

import java.util.Scanner;




//define a class

public class DD{




//add a main method

public static void main(String[] args){

int[] array = new int[16]; // declare the array

int i = 1;

System.out.println("Enter 15 ints for final grades in CSE2:");

while(i<16){	

	Scanner input = new Scanner(System.in);	

	if(input.hasNextInt()){

	array[0]=0;

	array[i] = input.nextInt();

       if(array[i]<=100 && array[i]>=0){

              if(array[i]>=array[i-1]){

              i++;

              }

              else{

          System.out.println("The number is not greater or equal to the last one.");

              }

       }

       else{

    System.out.println("The number is out of the range 0-100.");

       }

    }

    else{

	System.out.println("The number is not an integer.");

    }

    }

System.out.print("The grades, sorted, are:");

  for(int j = 1; j<16;j++){

	  System.out.print(array[j]+" ");

  }

System.out.println();

System.out.print("Enter a grade to search for:");

Scanner input1 = new Scanner (System.in);

int a = input1.nextInt();

binarySearch(array, a);

System.out.println("Scrambled:");

    seletionSort(array);

System.out.print("Enter a grade to search for:");

int b = input1.nextInt();



}//end of main method







//add a new method

public static void binarySearch(int[] array, int number){

int low = 1;

int high = array.length-1;

int count = 0;

int count1 = 1;

while(high>=low){

count++;

int mid = (low + high) / 2;

if(number<array[mid]){

	high = mid - 1;

}

else if(number == array[mid]){

	System.out.println(number + " was found in the list with " + count + " iterations." );

	count1=2;

	break;

}

else{

	low = mid + 1;

}

}

if (count1 != 2){

System.out.println(number + " was not found in the list with " + count + " iterations." );		

}

}//end of the method




//add a new method

public static void seletionSort(int[] array){

int j = 0; int middleNumber = 0;

for(int i = 1; i<array.length;i++){

j = 1 + ((int)Math.random()*15);

middleNumber = array[i];

array[i] = array[j];

array[j] = middleNumber;

}

for(int k = 1; k<16;k++){

System.out.print(array[k]+" ");

}

}//end of the method




//add a new method

//public static void linearSearch(int [])















































}//end of class


















