import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = a%2;
        int d = b%2;
        if (c!=0 && d!=0){
            System.out.println("we are odd");}
            else{
                System.out.println("we are simple");
        }
    }
}
