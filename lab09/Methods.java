//Duo Xu   2015/3/27
//lab09: Methods

import java.util.Random;


public class Methods{
    public static void main(String[] args){
        System.out.println("The "+adjectives()+" "+adjectives()+" "+subjects()+" "+verbs()+" the "+adjectives()+" "+objects()+".");
        
    }


public static String adjectives(){
    String adj="";
    Random rand=new Random();
    int randomInt=rand.nextInt(10);
    switch (randomInt){
        case 0 : adj+="beautiful";
                  break;
        case 1 : adj+="quick";
                  break;
        case 2 : adj+="brown";
                  break;
        case 3 : adj+="lazy";
                  break;
        case 4 : adj+="slow";
                  break;
        case 5 : adj+="white";
                  break;
        case 6 : adj+="ugly";
                  break;
        case 7 : adj+="smart";
                  break;
        case 8 : adj+="silly";
                  break;
        case 9 : adj+="yellow";
                  break;
        default : break;
     }
     return adj;
}







public static String subjects(){
    String adj="";
    Random rand=new Random();
    int randomInt=rand.nextInt(10);
    switch (randomInt){
        case 0 : adj+="boy";
                  break;
        case 1 : adj+="girl";
                  break;
        case 2 : adj+="fox";
                  break;
        case 3 : adj+="dog";
                  break;
        case 4 : adj+="superman";
                  break;
        case 5 : adj+="dinosaur";
                  break;
        case 6 : adj+="wolf";
                  break;
        case 7 : adj+="robot";
                  break;
        case 8 : adj+="teacher";
                  break;
        case 9 : adj+="kitchen";
                  break;
        default : break;
     }
     return adj;
}

public static String objects(){
    String adj="";
    Random rand=new Random();
    int randomInt=rand.nextInt(10);
    switch (randomInt){
        case 0 : adj+="cat";
                  break;
        case 1 : adj+="candy";
                  break;
        case 2 : adj+="computer";
                  break;
        case 3 : adj+="gun";
                  break;
        case 4 : adj+="pencil";
                  break;
        case 5 : adj+="chocolate";
                  break;
        case 6 : adj+="cake";
                  break;
        case 7 : adj+="computer";
                  break;
        case 8 : adj+="car";
                  break;
        case 9 : adj+="mouse";
                  break;
        default : break;
     }
     return adj;
}

public static String verbs(){
    String adj="";
    Random rand=new Random();
    int randomInt=rand.nextInt(10);
    switch (randomInt){
        case 0 : adj+="passed";
                  break;
        case 1 : adj+="used";
                  break;
        case 2 : adj+="ate";
                  break;
        case 3 : adj+="brought";
                  break;
        case 4 : adj+="bought";
                  break;
        case 5 : adj+="took";
                  break;
        case 6 : adj+="sold";
                  break;
        case 7 : adj+="made";
                  break;
        case 8 : adj+="found";
                  break;
        case 9 : adj+="saw";
                  break;
        default : break;
     }
     return adj;
}


}