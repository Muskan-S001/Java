import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt(); 
        if (m>=1 && m<=7){
            if (m%2==1){
                System.out.println(31);
            } else if (m==2){
                System.out.println(28);
            }
            else{
                System.out.println(30);
            }    
        } else {
            if (m%2==0){
                System.out.println(31);
            } else{
                System.out.println(30);
            }
        }
    }    
}    
