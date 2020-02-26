package src;

import src.problems.*;

public class Main {

  private static void solveProblem001() {
    Problem001 p1 = new Problem001();
    int ans = p1.sumMultiplesOf3And5(1000);
    String msg = "Solution to problem 001: " + Integer.toString(ans) + "\n";
    System.out.println(msg);
  }

  private static void solveProblem002() {
    Problem002 p2 = new Problem002();
    int ans = p2.evenFibonnaciSum(4000000);
    String msg = "Solution to problem 002: " + Integer.toString(ans) + "\n";
    System.out.println(msg);
  }

  public static void main(String[] args) {
    solveProblem001();
    solveProblem002();
  }
}
