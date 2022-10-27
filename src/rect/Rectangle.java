package rect;

public class Rectangle {
    double side1;
    double side2;

    double areaCalculator (double side1, double side2) {
        double area = side1*side2;
        return area;

    }
    double perimeterCalculator (double side1, double side2) {
        double perim = side1*2+side2*2;
        return perim;
    }

}
