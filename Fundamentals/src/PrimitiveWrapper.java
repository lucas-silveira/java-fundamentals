public class PrimitiveWrapper {
    public static void main(String[] args) {
        Byte b = 100;
        Short sh = 1000;
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue()); // 100
        System.out.println(sh.toString()); // "1000"
        System.out.println(Integer.parseInt("100")); // 100
        System.out.println(Boolean.parseBoolean("true")); // true
    }
}
