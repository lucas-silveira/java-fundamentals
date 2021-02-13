public class DateTest {

    public static void main(String[] args) throws Exception {
        Date date = new Date(10, 10, 2000);
        Date date2 = new Date(); // usando o segundo construtor

        System.out.printf("%d/%d/%d\n", date.day, date.month, date.year);
        System.out.println(date.getDateString());
        try {
            System.out.println(date.getDateString("day"));
            System.out.println(date.getDateString("dayAndMonth"));
        } catch (Exception err) {
            System.err.println(err);
        }
    }
}
