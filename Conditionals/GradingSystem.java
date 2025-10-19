import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int marks = scn.nextInt();
    if (marks > 90){
      System.out.println("Excellent");
    }
    else if (marks > 80){
      System.out.print("Good");
    } 
    else if (marks > 70){
      System.out.print("Fair");
    }
    else if (marks > 60){
      System.out.print("Meets Expectations");
    }
    else { 
      System.out.println("Below Expectations");
    }
  }
}
