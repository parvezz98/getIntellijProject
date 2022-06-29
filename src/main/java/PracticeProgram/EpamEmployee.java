package PracticeProgram;

public class EpamEmployee {
    private int Age;
    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }

    public int getAge() {
        return Age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.Age = age;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
