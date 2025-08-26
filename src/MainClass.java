import java.util.Scanner;

public class MainClass {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n\nMain Menu:\n" +
                    "1. Register User\n" +
                    "2. Show all users\n" +
                    "3. Add Employee\n" +
                    "4. Exit");

            System.out.print("Enter your choice: ");
            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
                continue;
            }

            switch (choice) {
                case 1:
                    RegisterService.RegisterUser();
                    break;

                case 2:
                    RegisterService.ShowAllUsers();
                    break;

                case 3:
                    RegisterService.AddEmployee();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Enter a valid choice!");
            }
        }
    }
}
