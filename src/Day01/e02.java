package Day01;
import java.util.Scanner;

/*
Write a program which can compute the factorial of a given numbers.The results
should be printed in a comma-separated sequence on a single line.Suppose the
following input is supplied to the program: 8 Then, the output should be:40320
 */
public class e02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to compute its factorial:");
    int number = scanner.nextInt();

    System.out.println("The factorial of number " + number + " is " + computeFactorial(number));

  }

  public static long computeFactorial(int n) {
    long factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial = factorial * i;
    }

    return factorial;
  }
}
