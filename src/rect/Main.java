package rect;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("Please enter side1: ");
        rect.side1 = scan.nextDouble();
        System.out.println("Please enter side2: ");
        rect.side2 = scan.nextDouble();
        System.out.println("Area is: " + rect.areaCalculator(rect.side1, rect.side2));
        System.out.println("Perimetr is: " + rect.perimeterCalculator(rect.side1, rect.side2));
    }


}
