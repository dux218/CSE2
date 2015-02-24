//Duo Xu     2015/2/13
//Cookies



import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        
Scanner input= new Scanner ( System.in ) ;
  System.out.print("enter the number of people in positive integer :");
//for number of people
if (input.hasNextInt()) {
    int numberOfPeople = input.nextInt() ;
    if (numberOfPeople>0) {
         //for number of cookies
         System.out.print("enter the number of cookies you are planning to buy :");
         boolean inter=input.hasNextInt();
         if (inter==true) {
            int numberOfCookies= input.nextInt();
            if(numberOfCookies>=0) {
                   //for number of  cookies each person have
                   System.out.print("How many do you want each person to get :");
                   if (input.hasNextInt()){
                        int numberEachPerson=input.nextInt();
                        if (numberEachPerson>=0 ){
                            
                            //three different situation
                            if (numberOfCookies<(numberOfPeople*numberEachPerson)){
                                int moreCookies=numberOfCookies-numberEachPerson*numberOfPeople;
                                
                                System.out.print("You will not have enough cookies. You need to buy at least "+moreCookies+
                                " more.");
                            }
                            
                            
                            else {
                                int remainder = numberOfCookies%numberOfPeople ;
                                if (remainder==0){
                                    System.out.println("you have enough cookies for each person and the amount will divide evenly");
                                }
                                else {
                                    System.out.println("You have enough, but they will not divide evenly.");
                                }
                            }
                            
                            
                            
                            
                            
                            
                            
                            
                            
                        }
                   
                       
                       
                       else {
                           System.out.print("the number is less than zero");
                       
                           return;
                       }
                       
                       
                   }
                   
                   else {
                      System.out.println("you did not enter an int");
                      return;
                      
                  }
                
                
            }
         
             
             else {
                System.out.println("the number of cookies is less than zero");
                return;
                 
             } 
             
         }
         else {
                System.out.println("you did not enter an int") ;
                return;
             
         }
        
        
        
     }
    else {
        System.out.println("the number of people is less than zero");
        return;
    }
   
}

else {
    System.out.println("You did not enter an int");
    return;
}



    }
}
