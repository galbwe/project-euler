package test;

import test.problems.*;

public class TestRunner {
  public static void main (String[] args) {
    TestProblem001 t1 = new TestProblem001(10, 23);
    t1.run();

    TestProblem002 t2 = new TestProblem002(100, 44);
    t2.run();
  }
}
