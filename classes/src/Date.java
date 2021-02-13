public class Date {
    Integer day, month, year;

    // método construtor
    public Date(int day, int anMonth, int anYear) {
        this.day = day; // o this é opcional
        month = anMonth;
        year = anYear;
    }

    // é possível termos dois construtores, desde que eles tenham uma assinatura diferente
    public Date() {}

    public String getDateString() {
        return String.format("%d/%d/%d", day, month, year);
    }

    // é possível termos dois métodos com o mesmo nome, desde que eles tenham uma assinatura diferente
    public String getDateString(String type) throws Exception {
        switch (type) {
            case "day":
                return day.toString();
            case "month":
                return month.toString();
            case "year":
                return year.toString();
            default:
                throw new Exception("Tipo inválido");
        }
    }
}
