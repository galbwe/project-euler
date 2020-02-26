package src.problems;

/*
  Given a positive integer N, compute the sum of all positive integers
  strictly less than N which are also multiples of 3 or 5.
*/

public class Problem001 {

    public int sumMultiplesOf3And5(int N) {
      int total = 0;
      for (int i = 0; i < N; i++) {
        if ( i % 3 == 0 || i % 5 == 0 ) {
          total = total + i;
        }
      }
      return total;
    }   
}
