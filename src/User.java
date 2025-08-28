public class User {

    static int counter = 0;
    final long id;
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
    public long getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return "ID: " + getId() +
                "\nEmail: " + getEmail() +
                "\nPassword: " + getPassword() +
                "\nContact: " + getContact() +
                "\nDOB: " + getDate();
    }
}
