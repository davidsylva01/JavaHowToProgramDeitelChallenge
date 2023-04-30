package deitelJavaHowToProgramChallenge.chapter3.healthRecordTask;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private char gender;
    int dateOfBirth;
    int heightIinInches;
    int weightInPounds;

    public HealthProfile(String firstName, String lastName, char gender, int dateOfBirth, int heightIinInches, int weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.heightIinInches = heightIinInches;
        this.weightInPounds = weightInPounds;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getHeightIinInches() {
        return heightIinInches;
    }

    public void setHeightIinInches(int heightIinInches) {
        this.heightIinInches = heightIinInches;
    }

    public int getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    @Override
    public String toString() {
        return "HealthProfile{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", heightIinInches=" + heightIinInches +
                ", weightInPounds=" + weightInPounds +
                '}';
    }
}
