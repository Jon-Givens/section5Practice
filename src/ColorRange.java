import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a wavelength in nanometers");
        double wavelength = in.nextDouble();
        if (wavelength >= 380 && wavelength < 450) {
            System.out.println("The color is Violet");
        } else if (wavelength >= 450 && wavelength < 495) {
            System.out.println("The color is Blue");
        } else if (wavelength >= 495 && wavelength < 570) {
            System.out.println("The color is Green");
        } else if (wavelength >= 570 && wavelength < 590) {
            System.out.println("The color is Yellow");
        } else if (wavelength >= 590 && wavelength < 620) {
            System.out.println("The color is Orange");
        } else if (wavelength >= 620 && wavelength < 750) {
            System.out.println("The color is Red");
        } else {
            System.out.println("Invalid number");
        }

        }
    }
