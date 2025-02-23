package Day02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Write a program which accepts a sequence of comma-separated numbers from console and generate a
list and a tuple which contains every number.Suppose the following input is supplied to the program:

34,67,55,33,12,98

Then, the output should be:

['34', '67', '55', '33', '12', '98'] ('34', '67', '55', '33', '12', '98')
 */
public class Question4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Prompt user to input a sequence of comma-separated numbers
    System.out.println("Enter a sequence of comma-separated numbers: ");
    String input = scanner.nextLine();
    scanner.close();

    String[] numberStrings = input.split(",");
    List<String> numberList = Arrays.asList(numberStrings);
    System.out.println(numberList);

    // Check datatype
    System.out.println("The data type of numberList is " + numberList.getClass().getName());

  }
}
