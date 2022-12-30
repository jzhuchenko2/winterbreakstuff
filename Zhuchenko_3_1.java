import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Zhuchenko_3_1 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the FIRST string:");
    String first = scanner.nextLine();
    System.out.println("Enter the SECOND string:");
    String second = scanner.nextLine();
    System.out.println("Enter the THIRD string:");
    String third = scanner.nextLine();
    List<String> strings = new ArrayList<String>();
    strings.add(first);
    strings.add(second);
    strings.add(third);
    System.out.println("Before sort:");
    for (String s : strings) {
      System.out.println(s);
    }
    Collections.sort(strings);
    System.out.println("After sort:");
    for (String s : strings) {
      System.out.println(s);
    }
    System.out.println("The Middle String that is in lexicographical '" + strings.get(1) + "'");
    scanner.close();
}
}
