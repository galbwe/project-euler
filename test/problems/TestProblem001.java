package test.problems;

import src.problems.Problem001;

public class TestProblem001 {
  public int input;
  public int expected;

  public TestProblem001(int input, int expected) {
    this.input = input;
    this.expected = expected;
  }

  public void run() {
    Problem001 p = new Problem001();
    int answer = p.sumMultiplesOf3And5(this.input);
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
