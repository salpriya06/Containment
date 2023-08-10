public class DateDob {

    private int day1;
    private int month1;
    private int year1;

    public DateDob(){
        day1 = 9;
        month1 = 6;
        year1 = 2000;
    }

    public DateDob(int day1, int month1, int year1) {
        if(day1 < 32) {
            this.day1 = day1;
        }
        if (month1 < 13) {
            this.month1 = month1;
        }
        this.year1 = year1;

    }

    public int getDay1() {
        return day1;
    }

    public void setDay1(int day1) {
        this.day1 = day1;
    }

    public int getMonth1() {
        return month1;
    }

    public void setMonth1(int month1) {
        this.month1 = month1;
    }

    public int getYear1() {
        return year1;
    }

    public void setYear1(int year) {
        this.year1 = year1;
    }
}
