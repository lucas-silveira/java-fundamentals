public class Variables {
    public static void main(String[] args) {
        final double PI = 3.14159; // Semelhante ao "const". Com "final" a variável não pode ser modificada.
        int radius = 3;

        double area = PI*radius*radius;

        System.out.println("Área = " + area);

        var b = 4.5; // inferência de tipo
    }
}
