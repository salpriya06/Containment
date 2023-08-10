public class BankAccount {

    private int accNo;
    private String accName;
    private float accBal;
    private Date openingDate;
    private DateDob dob;

    public BankAccount() {
        accNo = 8484;
        accName = "Saving Account";
        accBal = 35000.30F;
        openingDate = new Date(9,6,2000);
        dob = new DateDob(10,12,1999);

    }

    public BankAccount(int accNo, String accName, float accBal, int day, int month, int year, int day1, int month1, int year1) {
        this.accNo = accNo;
        this.accName = accName;
        this.accBal = accBal;
        this.openingDate = new Date(day, month, year);
        this.dob = new DateDob(day,month,year);

            }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public float getAccBal() {

        return accBal;
    }

    public void setAccBal(float accBal) {

        this.accBal = accBal;
    }

    public Date getOpeningDate() {

        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {

        this.openingDate = openingDate;
    }

    public void display(){
        System.out.println(" Account Number : "  + accNo );
        System.out.println(" Account Holder Name : " + accName );
        System.out.println(" Account Balance : " + accBal );
        System.out.println(" Bank Account Opening Date : " + openingDate.getDay() + "-" + openingDate.getMonth() + "-" + openingDate.getYear());
        System.out.println(" Bank Account Holder's Birth Date : " + dob.getDay1() + "-" + dob.getMonth1() + "-" + dob.getYear1());
    }

}
