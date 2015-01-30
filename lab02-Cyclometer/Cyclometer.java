// Duo Xu     2015/1/30   CSE2
//[CSE2] lab02: Arithmetic Calculations
//put in the time and rotation counts for two trips, and then print out 
  //  number of minutes for each trip
  //  number of counts for each tirp
  //  distance of each trip in miles
  //  distance for the two trips combined

public class Cyclometer  {
    //main method required for every Java program
    public static void main(String[] args)  {

// our input date
int secsTrip1=480;    //time of trip1 is 480 seconds
int secsTrip2=3220;   //time of trip2 is 3220 seconds
int countsTrip1=1561; //for trip1, the wheels had 1561 turns
int countsTrip2=9037; //for trip2, the wheels had 9037 turns

//our intermediate variables and output data.
double wheelDiameter=27.0,          //define a value as double
PI=3.14159,                         //a Greek symbol called pi
feetPerMile=5280,                   //change unit from mile to feet
inchesPerFoot=12,                   //change unit from foot to inches
secondsPerMinute=60;                //change unit from minute to seconds
double distanceTrip1, distanceTrip2,totalDistance;      //define three values as double

//print out the numbers that you have stored in the variables that store number of seconds and the counts

  //Trip1
System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");

  //Trip2
System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");


//Compute the values for the distances
  //run the calculations above and here is the results
  //Trip 1 took 8.0 minutes and had 1561 counts.                    
  //Trip 2 took 53.666666666666664 minutes and had 9037 counts.
  
distanceTrip1=countsTrip1*wheelDiameter*PI;

// Above gives distance in inches (for each count, a rotation of the wheel travels the diameter in inches times PI)

distanceTrip1/=inchesPerFoot*feetPerMile;                                // Gives distance of trip1 in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;    // Gives distance of trip2 in miles

totalDistance=distanceTrip1+distanceTrip2;                               // Gives total distance in miles

//Print out the output data.
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");







  
    }    //end of main method


}     //end of class


