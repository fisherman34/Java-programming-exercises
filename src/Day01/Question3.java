package Day01;
import java.util.HashMap;
import java.util.Scanner;

/*
With a given integral number n, write a program to generate a dictionary that contains (i, i x i) such
that is an integral number between 1 and n (both included). and then the program should print the
dictionary.Suppose the following input is supplied to the program: 8

Then, the output should be:

{1: 1, 2: 4, 3: 9, 4: 16, 5: 25, 6: 36, 7: 49, 8: 64}
 */
public class Question3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer number n");

    int n = scanner.nextInt();
    HashMap<Integer, Integer> result = new HashMap<>();

    for (int i = 0; i <=n; i++){
      result.put(i, i*i);
    }

    System.out.println(result);

  }
}
