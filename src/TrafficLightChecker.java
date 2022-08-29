import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
        System.out.println("Enter a light color number (red = 1, green = 2, yellow = 3)");
      int currentColor = in.nextInt();

      if (currentColor == 1) {
          System.out.println("The next light is Green");
      } else if (currentColor == 2) {
          System.out.println("The next light is Yellow");
      } else if (currentColor == 3) {
          System.out.println("The next light is Red");
      } else {
          System.out.println("Invalid number");
      }
    }

}
