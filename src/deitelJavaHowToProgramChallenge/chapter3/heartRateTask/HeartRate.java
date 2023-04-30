package deitelJavaHowToProgramChallenge.chapter3.heartRateTask;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String dateOfBirth = dayOfBirth+"/"+monthOfBirth+"/"+yearOfBirth;
    int currentYear = 2023;
    boolean isTargetHeartrange = false;

    public HeartRate(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int calculateAge(){
        int age = currentYear - yearOfBirth;
        return age;
    }
    public int getMaximumHeartRate(){
        int maxHeartRate = 220 - calculateAge();
        return maxHeartRate;
    }
    public double targetHeartRange(){
         double target = 0.5*getMaximumHeartRate();
         return target;
    }
}
