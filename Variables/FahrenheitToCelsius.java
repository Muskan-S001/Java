import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        float tempC = scn.nextFloat();
        float tempF = tempC*9/5 + 32; 
        System.out.printf("%.6f",  tempF);
    }
}
