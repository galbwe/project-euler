package src;

import src.problems.Problem001;

public class Main {

  private static void solveProblem001() {
    Problem001 p1 = new Problem001();
    int ans = p1.sumMultiplesOf3And5(1000);
    String msg = "Solution to problem 001: " + Integer.toString(ans) + "\n";
    System.out.println(msg);
  }

  public static void main(String[] args) {
    solveProblem001();
  }
}
