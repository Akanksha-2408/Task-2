import java.util.Scanner;

public class User {

    final long id;
    static int counter = 0;
    String email;
    String password;
    String contact;
    String Date;

    public User(String email, String password, String contact, String Date) {
        this.id = ++counter;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.Date = Date;
    }

    //Getters and Setters

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }

    // Instanceof operator

    public static void main(String[] args) {
        System.out.println("\n\ninstanceof Operator");

        Employee emp = new Employee();
        if(emp instanceof Employee){
            System.out.println("emp is instance of Employee");
        }
        else{
            System.out.println("emp is not instance of Employee");
        }

        Object obj = emp;
        if(obj instanceof Employee){
            System.out.println("obj is instance of Employee");
        }
        else {
            System.out.println("obj is not instance of Employee");
        }

        Object obj1 = "Hello";
        if(obj1 instanceof String){
            System.out.println("obj1 is instance of String");
        }
        else {
            System.out.println("obj1 is not instance of String");
        }

        Object nullobj = null;
        if(nullobj instanceof Employee){
            System.out.println("nullobj is instance of Employee");
        }
        else{
            System.out.println("nullobj is not instance of Employee");
        }
    }
}
