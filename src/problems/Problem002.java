/*
  Problem 2: Find the sum of the terms in the Fibonnaci sequence that are even
  and do not exceed 4 million.

  Fibonnaci sequence:

  f0 = 1;
  f1 = 2;
  f2 = 3;
  f3 = 5;
  f4 = 8;

  and so on...
*/

package src.problems;

public class Problem002 {
  public int evenFibonnaciSum(int maxValue) {
    int a = 1;
    int b = 2;
    int temp;
    int sum = 0;
    while (b < maxValue) {
      if (b % 2 == 0) {
        sum += b;
      }
      temp = b;
      b = a + b;
      a = temp;
    }
    return sum;
  }
}
