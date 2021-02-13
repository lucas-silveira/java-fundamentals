public class AreaCirc {
    final static double PI = 3.1415;
    double radius;

    public AreaCirc(double initialRadius) {
        radius = initialRadius;
    }

    double area() {
        return PI * Math.pow(radius, 2);
    }
}
