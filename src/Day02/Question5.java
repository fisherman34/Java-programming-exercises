package Day02;
import java.util.Scanner;

/*
Define a class which has at least two methods:

getString: to get a string from console input
printString: to print the string in upper case.
Also please include simple test function to test the class methods.
 */
class MyStringClass {
  private String inputString;

  public void getString(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a string for this object: ");
    inputString = scanner.nextLine();
  }

  public void printString(){
    if (inputString != null) {
      System.out.println(inputString.toUpperCase());
    } else {
      System.out.println("No input string found.");
    }
  }
}

public class Question5 {
  public static void main(String[] args) {
    MyStringClass myString = new MyStringClass();
    myString.getString();
    myString.printString();
  }
}
