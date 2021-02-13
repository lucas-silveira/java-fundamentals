public class Date {
    int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDateString() {
        return String.format("%d/%d/%d", this.day, this.month, this.year);
    }
}
