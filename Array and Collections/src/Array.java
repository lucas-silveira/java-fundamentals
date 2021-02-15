import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // No Java arrays são estruturas estáticas.
        // Eles devem ser inicializados com um tamanho prefixado. Esse tamanho não pode ser alterado.
        // Arrays são homogêneos, ou seja, os valores dentro do array devem ser do mesmo tipo.

        double[] a = new double[2];
        System.out.println(a[0]); // 0.0

        a[0] = 1.2;
        System.out.println(a[0]); // 1.2

        double[] b = { 2.0, 2.4 };
        System.out.println(Arrays.toString(b)); // [2.0, 2.4]

        // Nested arrays
        double[][] c = new double[2][3];
        System.out.println(c[0][1]); // 0.0

        System.out.println(Arrays.toString(a)); // [1.2, 0.0]

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (double item : b) {
            System.out.println(item);
        }
    }
}
