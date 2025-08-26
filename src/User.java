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

    @Override
    public String toString() {
        return "ID: " + id +
                "\nEmail: " + email +
                "\nPassword: " + password +
                "\nContact: " +  contact +
                "\nDOB: " + Date;
    }
}
