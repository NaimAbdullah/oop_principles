package inheritance;

public class Person {

    // Instance Variables
    public String fName;
    public String lName;
    protected int age;
    protected String gender;
    double weight;
    double height;
    private String DOB;
    private String SSN;

    public void sleep(){
        System.out.println("Person sleeps");
    }

    public void learn(){
        System.out.println("Person learns");
    }

    public void walk(){
        System.out.println("Person walks");
    }

    public void eats(){
        System.out.println("Person eats");
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
