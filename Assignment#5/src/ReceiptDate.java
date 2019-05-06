public class ReceiptDate {

    private String year;
    private String day;
    private String month;
    private String date;

    public ReceiptDate(String dy, String mnth, String yr) {
    	
    	month = mnth;
        day = dy;
        year = yr;

    }

    public ReceiptDate()
    {

    }

  
    public void setMonth(String mnth) {

        month = mnth;

    }
    
  public void setDay(String dy) {

        day = dy;

    }

    public void setYear(String yr) {

        year = yr;

    }

    
    public String getMonth() {

        return month;

    }
    
    public String getDay() {

        return day;

    }

    public String getYear() {

        return year;

    }

    public void setDate() {

        date = this.month + "/" + this.day + "/" + this.year;

    }

    public String getDate() {

        return date;

    }

}