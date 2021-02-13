public class DefaultValue {
    // Variáveis de instância são iniciadas com um valor padrão.
    byte aByte; // o valor padrão para essa variável será 0;
    // byte, short, int, long -> 0
    // float, double -> 0.0
    // boolean -> false
    // char -> '\u0000'

    public DefaultValue() {
        // Variáveis locais não são iniciadas com um valor padrão.
        int a;
        // System.out.println(a); error
        System.out.println(aByte); // 0

        // Objetos podem receber o valur nulo.
        String b = null;
        System.out.println(b); // null
    }
}
