package Day02;

import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) {
    final int C = 50;
    final int H = 30;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a comma-separated sequence of D: ");
    String input = scanner.nextLine();
    scanner.close();

    String[] dValues = input.split(",");
    int[] qValues = new int[dValues.length];

    for (int i = 0; i < dValues.length; i++) {
      int D = Integer.parseInt(dValues[i]);
      qValues[i] = (int) Math.sqrt((double) (2 * C * D) / H);
    }

    for (int i = 0; i < qValues.length; i++) {
      System.out.print(qValues[i]);
      if (i < qValues.length -1) {
        System.out.print(",");
      }
    }

  }
}
