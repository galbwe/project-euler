package test.problems;

import src.problems.Problem002;

public class TestProblem002 {
  public int input;
  public int expected;

  public TestProblem002(int input, int expected) {
    this.input = input;
    this.expected = expected;
  }

  public void run() {
    Problem002 p = new Problem002();
    int answer = p.evenFibonnaciSum(this.input);
    String status = "";
    if (answer == this.expected) {
      status = "passed";
    } else {
      status = "failed";
    }
    String msg = "Testing Problem 001\n"
      + "Input: " + Integer.toString(this.input) + "\n"
      + "Output: " + Integer.toString(answer) + "\n"
      + "Expected: " + Integer.toString(this.expected) + "\n"
      + "Status: " + status + "\n\n";
    System.out.println(msg);
  }
}
