import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long tempInCelsius = scn.nextLong();
        long tempInFahrenheit = (tempInCelsius*9/5)+32;
        System.out.print(tempInFahrenheit);
    }
}
