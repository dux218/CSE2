//Duo Xu    2015/2/27
//Laboratory Session 6: All about LOOPS

public class SmileGenerator{
    public static void main(String[] args){
        int count1=1;
        while (count1<=5){
            System.out.print(":)");
            count1++;
        }
        System.out.println("\n");
        int count2=1;
        do {
            System.out.print(":)");
            count2++;
        } while (count2<=5);
        System.out.println("\n");
        
        
        int count3= (int) (Math.random()*101);
        int count4=0;
        while (count3>0){
            
            if (((count4)%30)==0){
                System.out.println("\n");
                System.out.print(":)");
                count4++;
                count3--;
            }
            else {
                System.out.print(":)");
                count4++;
                count3--;
                
            }
        }
        System.out.println("\n");
        
        int count5=1; int n=0; int m=1;
        while(count5<=10){
            if(n==m){
                System.out.print("\n");
                m++;
                n=0;
            }
            else {
                System.out.print(":)");
                n++;
                count5++;
            }
        }
        System.out.print("\n");
        
    }
}