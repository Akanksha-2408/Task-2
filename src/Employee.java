import java.util.Objects;

public class Employee {

    // Primitive Fields
    private byte employeeId;
    private short departmentCode;
    private int age;
    private long contact;
    private double salary;
    private float workingHours;
    private char grade;
    private boolean isPermanent;

    // Constructor
    public Employee() {
    }

    //Getters and Setters
    public byte getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(byte employeeId) {
        this.employeeId = employeeId;
    }

    public short getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(short departmentCode) {
        this.departmentCode = departmentCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(float workingHours) {
        this.workingHours = workingHours;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    @Override
    public String toString() {
        return "\nEmployee Id: " + getEmployeeId() +
                "\nDepartment code: " + getDepartmentCode() +
                "\nAge: " + getAge() +
                "\nSalary: " + getSalary() +
                "\nWorking hours: " + getWorkingHours() +
                "\nContact Number: " + getContact() +
                "\nGrade: " + getGrade() +
                "\nIs Permanent: " + isPermanent();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;
        return employeeId == employee.employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
}
