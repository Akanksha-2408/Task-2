import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class RegisterService {

    static Queue<User> users = new LinkedList<>();
    static List<User> list = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static void RegisterUser() {
            System.out.println("Enter email: ");
            String email = sc.nextLine();
            if (!email.matches(RegularExp.email)) {
                System.out.println("Invalid email format");
                return;
            }

            System.out.println("Enter password: ");
            String password = sc.nextLine();
            if (!password.matches(RegularExp.password)) {
                System.out.println("Invalid password format");
                return;
            }

            System.out.println("Enter contact number: ");
            String contact = sc.nextLine();
            if (!contact.matches(RegularExp.contact)) {
                System.out.println("Invalid contact number format");
                return;
            }

            System.out.println("Enter date (dd-mm-yyyy): ");
            String date = sc.nextLine();
            if (!date.matches(RegularExp.date)) {
                System.out.println("Invalid date format");
                return;
            }

            User u = new User(email, password, contact, date);
            users.add(u);
            list.add(u);
            System.out.println("User registered successfully!");
    }

    public static void ShowAllUsers() {
        if (list.isEmpty()) {
            System.out.println("No users found.");
            return;
        }

        System.out.println("\nUser Data:");
        for (User u : list) {
            System.out.println("Id: " + u.id +
                    "\nEmail: " + u.getEmail() +
                    "\nPassword: " + u.getPassword() +
                    "\nContact: " + u.getContact() +
                    "\nDate: " + u.getDate() + "\n");
        }
    }
}
