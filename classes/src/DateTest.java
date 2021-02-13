public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(10, 10, 2000);

        System.out.printf("%d/%d/%d\n", date.day, date.month, date.year);
        System.out.println(date.getDateString());
    }
}
