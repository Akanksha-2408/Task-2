import java.util.Objects;

public class Employee {

        byte employeeId;
        short departmentCode;
        int age;
        long annualSalary;
        float workingHours;
        double monthlySalary;
        char grade;
        boolean isPermanent;

    //Constructor

    public Employee() {}

    public Employee(byte employeeId, short departmentCode, int age, long annualSalary, float workingHours, double monthlySalary, char grade, boolean isPermanent) {
        this.employeeId = employeeId;
        this.departmentCode = departmentCode;
        this.age = age;
        this.annualSalary = annualSalary;
        this.workingHours = workingHours;
        this.monthlySalary = monthlySalary;
        this.grade = grade;
        this.isPermanent = isPermanent;
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

    public long getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(long annualSalary) {
        this.annualSalary = annualSalary;
    }

    public float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(float workingHours) {
        this.workingHours = workingHours;
    }

    public double getMonthlySalary() {return monthlySalary;}

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
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

    public String toString(){
        return "\nEmployee Id: " + employeeId + "\nDepartment code: " + departmentCode + "\nAge: " + age + "\nAnnual salary: " + annualSalary + "\nworking hours: " + workingHours + "\nmonthly salary: " + monthlySalary + "\ngrade: " + grade + "\nisPermanent: " +  isPermanent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true; }
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
}