import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char input = scn.next().charAt(0);
        int ascvalue = input;
        if (ascvalue>=65 && ascvalue<=90){
            System.out.println("1");  //We can also give 1 without quotes
        }
        else if (ascvalue>=97 && ascvalue<=122){
            System.out.println("0");
        }
        else {
            System.out.println("-1");
        }
    }
}
