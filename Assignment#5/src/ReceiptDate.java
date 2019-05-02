public class ReceiptDate {

    private String date;
    private String day;
    private String month;
    private String date;

    public ReceiptDate(String dy, String mnth, String yr) {

        day = dy;
        month = mnth;
        year = yr;

    }

    public ReceiptDate()
    {

    }

    public void setDay(String dy) {

        day = dy;

    }

    public void setMonth(String mnth) {

        month = mnth;

    }

    public void setYear(String yr) {

        year = yr;

    }

    public String getDay() {

        return day;

    }

    public String getMonth() {

        return month;

    }

    public String getYear() {

        return year;

    }

    public void setDate() {

        date = this.day + "-" + this.month + "-" + this.year;

    }

    public String getDate() {

        return date;

    }

}