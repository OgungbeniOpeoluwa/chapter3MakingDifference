public class HeartRate {

    private String firstName;
    private String surname;
    private int dateOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;


    public HeartRate(String firstname, String surname, int dateOfBirth, String monthOfBirth, int yearOfBirth) {
        this.firstName = firstname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String firstname) {
        this.firstName = firstname;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    int age = 0;

    public int caculateAgeInyears(int currentYear) {
        age = currentYear - yearOfBirth;
        return age;
    }

    double maxHeartRate = 0;

    public double maximumHeartRate() {
        int number = 220;
        maxHeartRate = number - age;
        return maxHeartRate;
    }

    public double targetHeartRate(double number) {
        double rate = 0;
        if (number >= 50) {
             rate = number / 100;

        }
        return maxHeartRate * rate;

    }
}




