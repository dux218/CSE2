
// public class DD{
//     public static void main(String[] args){
//         int[] Array1={1,2,3,4,5,6,7,8,9};
//         int target =10 ;
//         int a=3;
//         int b=8;
//         if(search(Array1,target,a,b)){
//             System.out.println("true");
//         }
//         else{
//             System.out.println("False");
//         }
//     }
//     public static boolean search (int[] myArray, int target, int minRange, int maxRange){
//         if(minRange>myArray.length-1||maxRange>myArray.length-1||minRange>maxRange){
//             return false;
//         }
//         else{
//             for (int i=minRange;i<=maxRange;i++){
//                 if(myArray[i]==target){
//                     return true;
//                 }
                
//             }
//             return false;
//         }
//     }
// }

// public class DD{
//     public static void main(String[] args){
//         int [] xx={1,2,3,4,5,6,7,8};
//         int a=8;
//         int[] array1=resize(xx,a);
//         for(int i=0;i<a;i++){
//             System.out.print(array1[i]);
//         }
        
//     }
//     public static int[] resize(int[] myArray, int newsize){
//         int[] newArray2=new int[newsize];
//         if(newsize<=myArray.length){
//             for(int i=0;i<newsize;i++){
//                 newArray2[i]=myArray[i];
//             }
//             return newArray2;
            
//         }
//         else{
//             for(int i=0;i<myArray.length;i++){
//                 newArray2[i]=myArray[i];
//             }
//             for(int i=myArray.length;i<newsize;i++){
//                 newArray2[i]=0;
//             }
//             return newArray2;
//         }
//     }
// }
       
// public class DD{
//     public static void main(String[] args){
//         int[] aa={1,2,2,3,4,5,6,7,7,7,7,9,9,9,9,9,9};
//         aa=noReps(aa);
//         for(int i=0;i<aa.length;i++){
//             System.out.print(aa[i]);
//         }
        
//     }
//     public static int[] noReps(int[] myArray){
//         int[] outArray=new int [myArray.length];
//         int j=0;
//         for(int i=0;i<myArray.length;i++){
//             if(search(outArray,myArray[i],0,j)){
                
//             }
//             else{
//                 outArray[j]=myArray[i];
//                 j++;
//             }
//         }
//         j--;
//         outArray=resize(outArray,j+1);
//         return outArray;
//     }
//         public static int[] resize(int[] myArray, int newsize){
//         int[] newArray2=new int[newsize];
//         if(newsize<=myArray.length){
//             for(int i=0;i<newsize;i++){
//                 newArray2[i]=myArray[i];
//             }
//             return newArray2;
            
//         }
//         else{
//             for(int i=0;i<myArray.length;i++){
//                 newArray2[i]=myArray[i];
//             }
//             for(int i=myArray.length;i<newsize;i++){
//                 newArray2[i]=0;
//             }
//             return newArray2;
//         }
//     }
    
    
//         public static boolean search (int[] myArray, int target, int minRange, int maxRange){
//         if(minRange>myArray.length-1||maxRange>myArray.length-1||minRange>maxRange){
//             return false;
//         }
//         else{
//             for (int i=minRange;i<=maxRange;i++){
//                 if(myArray[i]==target){
//                     return true;
//                 }
                
//             }
//             return false;
//         }
//     }

    
    
// }


// public class DD{
//     public static void main(String[] args){
//         int[] aa={6, 12, 15, 6,17, 0, 0, 0, 0};
//         print(aa);
//     }
//     public static void print(int x[]){
//         if(x[0]>x.length-1){
//             System.out.println(
//               "Error, x[0] exceeds x.length-1");
//         }
//         else {
//             System.out.print("{");
//             for(int j=1;j<x[0]+1;j++){
//                 if(j>1){
//                     System.out.print(", ");
//                 }
//                 System.out.print(x[j]);
//             }
//             System.out.println("}");
//         }
//     }

// }

// public class DD{
//     public static void main(String[] args){
//         String[] xx= new String [3];
//         xx[0]="AAAA";
//         xx[1]="BBBBBBBBBBBBBBBB";
//         xx[2]="CC";
//         xx=range(xx);
//         for(int i=0;i<2;i++){
//             System.out.println(xx[i]);
            
//         }
//     }
//     public static String[] range(String[] x){
//         int min=x[0].length();
//         int minIndex=0;
//         int max=x[0].length();
//         int maxIndex=0;
//         for(int i=1;i<x.length;i++){
//             if(min>x[i].length()){
//                 min=x[i].length();
//                 minIndex=i;
//             }
//             if(max<x[i].length()){
//                 max=x[i].length();
//                 maxIndex=i;
//             }
//         }
//         String[] output=new String [2];
//         output[0]=x[minIndex];
//         output[1]=x[maxIndex];
//         return output;
        
//     }
// }

