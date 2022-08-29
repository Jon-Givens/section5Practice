import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a light color number (red = 1, green = 2, yellow = 3)");
        int currentColor = in.nextInt();
        switch (currentColor) {
            case 1 :
                System.out.println("The next light is Green");
                break;
            case 2 :
                System.out.println("The next light is Yellow");
                break;
            case 3 :
                System.out.println("The next light is Red");
                break;
            default :
                System.out.println("Invalid number");
        }

    }

}
