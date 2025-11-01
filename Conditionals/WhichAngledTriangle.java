import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int side1 = scn.nextInt();
        int side2 = scn.nextInt();
        int side3 = scn.nextInt();
        int ls = Math.max(side1,Math.max(side2, side3));
        int s = (side1*side1+side2*side2+side3*side3);
        if (2*(ls*ls)<s){
            System.out.print(1);
        }
        else if (2*(ls*ls)>s){
            System.out.print(3);
        }
        else {
            System.out.print(2);
        }
    }
}
