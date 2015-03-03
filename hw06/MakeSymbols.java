//Duo Xu   2015/2/27
//[CSE2] hw06: Getting Loopy   Program3:

//add class and main method
public class MakeSymbols {
    //main method required for every java program
    public static void main(String[] args){
        //create random number from 0 to 100
        int random1= (int) (Math.random()*101);
        //examine whether it is even or odd
        if (random1%2==0){
            //print the number generate
            System.out.println("Random number generated:"+random1);
            
            System.out.print("The output pattern: ");
            //print * 
            do{
                 System.out.print("*");
                random1--;
            } while(random1>=1);
           
            System.out.print("\n");
        }
        //case of odd number generated
        else {
            System.out.println("Random number generated:"+random1);
            System.out.print("The output pattern: ");
            do{
                //pring &
                System.out.print("&");
                //reduce number by one represent one "&"" had been printed
                random1--;
            } while(random1>=1);
            
           System.out.print("\n");
            
        }
    }
}


