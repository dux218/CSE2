//Duo Xu     2015/2/6
//Gathering Input    program1

//prompts the user to enter the number of counts on a cyclometer
//and the number of seconds during which the counts occurred 
//and then an then prints out the distance traveled and the average miles per hour.


//import Scanner class
import java.util.Scanner ;

//add the class and main mehod
public class Bicycle {
    //main method required for every java program
    public static void main(String[] args) {
        
//intermediate variables 
double wheelDiameter=27.0    ;
double π=3.14159             ;
double feetPerMile=5280.0    ;
double inchesPerFoot=12.0    ; 
double secondsPerHour=3600.0 ;
        
//declare an instance of the Scanner object
Scanner input ;

//create an instance that will take input from STDIN
input = new Scanner (System.in)  ;

//now prompt the user for the number of seconds
  System.out.print("Enter the number of seconds:");
//accept user input of the number of seconds  
double nSeconds= input.nextDouble()  ;
// I want hours instead of seconds
double nHours= nSeconds/secondsPerHour ;

//now prompt the user for the number of counts
  System.out.print("Enter the number of counts:") ;
//accept user input of the number of counts
int nCounts= input.nextInt()  ;
//calculate the distance in inches
double distanceInInches1=nCounts*wheelDiameter*π ;
//I want Miles instead of Inches
double distanceInMiles1=distanceInInches1/(feetPerMile*inchesPerFoot) ;
//change into pleasant format
int distanceInMiles2= (int) (distanceInMiles1*100);
double distanceInMiles= distanceInMiles2/100.0;


//calculate the average miles per hour
double averageSpeed1=distanceInMiles/nHours ;
//change into pleasant format
int averageSpeed2=(int) (averageSpeed1*100);
double averageSpeed=averageSpeed2/100.0;

//now print out the distance traveled and average miles per hour
System.out.println("The distance traveled is :"+distanceInMiles+" Miles and the"+
" average mph is :"+averageSpeed+"miles per hour") ;


    }
}


 