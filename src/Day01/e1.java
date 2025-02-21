package Day01;

/*
Write a program which will find all such numbers which are divisible by 7 but are
not a multiple of 5, between 2000 and 3200 (both included).The numbers obtained should
be printed in a comma-separated sequence on a single line.
 */
public class e1 {
  public static void main(String[] args) {
    StringBuffer result = new StringBuffer();
    for (int i = 2000; i < 2300; i++) {
      if(i % 3 == 0 && i % 5 != 0) {
        result.append(i).append(",");
      }
    }

    // Remove the trailing comma if it exists
    if (!result.isEmpty()) {
      result.setLength(result.length() - 1);
    }
    System.out.println(result.toString());
  }
}
